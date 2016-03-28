package com.yitouwushui.mvp.presenter;

import com.yitouwushui.mvp.bean.Topic;
import com.yitouwushui.mvp.iview.IMvpView;
import com.yitouwushui.mvp.model.Callback.TopicModelCallBack;
import com.yitouwushui.mvp.model.ITopicModel;
import com.yitouwushui.mvp.model.Impl.TopicModel;

import java.util.List;

/**
 * Created by yitouwushui on 2016/3/28.
 */
public class MvpPresenter {

    private IMvpView iView;
    private ITopicModel model;

    public MvpPresenter(IMvpView iView) {
        this.iView = iView;
        this.model = new TopicModel(new TopicModelCallBack() {

            /**
             * 添加成功
             *
             * @param topic
             */
            @Override
            public void addSuccess(Topic topic) {
                MvpPresenter.this.iView.addSuccess(topic);
            }

            /**
             * 删除成功
             *
             * @param topic
             */
            @Override
            public void delSuccess(Topic topic) {
                MvpPresenter.this.iView.delSuccess(topic);
            }

            /**
             * 修改成功
             *
             * @param newTopic
             */
            @Override
            public void modSuccess(Topic newTopic) {
                MvpPresenter.this.iView.modSuccess(newTopic);
            }

            /**
             * 查询成功
             *
             * @param topics
             * @return
             */
            @Override
            public void querySuccess(List<Topic> topics) {
                MvpPresenter.this.iView.querySuccess(topics);
            }

            /**
             * 发生错误
             */
            @Override
            public void error() {
                MvpPresenter.this.iView.error();
            }
        });


    }


    //*********************************************************

    /**
     * 添加主题
     *
     * @param topic
     */
    public void addTopic(Topic topic) {
        this.model.add(topic);
    }

    /**
     * 删除主题
     *
     * @param topic
     */
    public void delTopic(Topic topic) {
        this.model.del(topic);
    }

    /**
     * 修改主题
     *
     * @param topic
     */
    public void modTopic(Topic topic) {
        this.model.mod(topic.topicId, topic);
    }

    /**
     * 查询主题
     */
    public void queryTopic() {
        this.model.query();
    }

}
