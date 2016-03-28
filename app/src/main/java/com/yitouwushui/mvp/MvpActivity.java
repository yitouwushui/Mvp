package com.yitouwushui.mvp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.yitouwushui.mvp.bean.Topic;
import com.yitouwushui.mvp.iview.IMvpView;
import com.yitouwushui.mvp.presenter.MvpPresenter;

import java.util.List;

public class MvpActivity extends AppCompatActivity implements IMvpView {

    private TextView addTV;
    private TextView delTV;
    private TextView modTV;
    private TextView queryTV;

    private MvpPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.addTV = (TextView) this.findViewById(R.id.add_tv);
        this.delTV = (TextView) this.findViewById(R.id.del_tv);
        this.modTV = (TextView) this.findViewById(R.id.mod_tv);
        this.queryTV = (TextView) this.findViewById(R.id.query_tv);

        this.presenter = new MvpPresenter(this);

        Topic topic = new Topic();
        topic.userId = 267L;
        topic.topicId = 1267L;
        topic.content = "Save you from anything";

        this.presenter.addTopic(topic);
        this.presenter.delTopic(topic);
        this.presenter.modTopic(topic);
        this.presenter.queryTopic();


    }

    /**
     * 添加成功
     *
     * @param topic
     */
    @Override
    public void addSuccess(Topic topic) {
        Log.i("MvpActivity", topic.content);
        this.addTV.setText("Add:"+topic.content);
    }

    /**
     * 删除成功
     *
     * @param topic
     */
    @Override
    public void delSuccess(Topic topic) {
        Log.i("MvpActivity",topic.content);
        this.delTV.setText("Del:"+topic.content);
    }

    /**
     * 修改成功
     *
     * @param newTopic
     */
    @Override
    public void modSuccess(Topic newTopic) {
        Log.i("MvpActivity", newTopic.content);
        this.modTV.setText("Mod:" + newTopic.content);
    }

    /**
     * 发生错误
     */
    @Override
    public void error() {

    }

    /**
     * 查询成功
     *
     * @param list
     * @return
     */
    @Override
    public void querySuccess(List<Topic> list) {
        Topic topic = list.get(0);
        Log.i("MvpActivity", topic.content);
        this.queryTV.setText("Query:"+topic.content);
    }

}
