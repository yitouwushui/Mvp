package com.yitouwushui.mvp.model.Impl;

import com.yitouwushui.mvp.bean.Topic;
import com.yitouwushui.mvp.model.Callback.TopicModelCallBack;
import com.yitouwushui.mvp.model.ITopicModel;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by yitouwushui on 2016/3/28.
 */
public class TopicModel implements ITopicModel {

    private TopicModelCallBack callBack;

    public TopicModel(TopicModelCallBack callBack) {
        this.callBack = callBack;
    }

    /**
     * 添加Topic
     *
     * @param topic
     */
    @Override
    public void add(Topic topic) {
        // 先进行网络请求

        // 返回数据之后
        this.callBack.addSuccess(topic);

    }

    /**
     * 删除主题
     *
     * @param topic
     */
    @Override
    public void del(Topic topic) {
        // TODO 先进行网络请求


        // TODO 返回数据 这里默认为返回原数据
        this.callBack.delSuccess(topic);
    }

    /**
     * 修改主题
     *
     * @param topicId
     * @param topic
     */
    @Override
    public void mod(Long topicId, Topic topic) {
        // TODO ...网络请求后...

        // TODO 返回数据 这里默认为返回原数据
        this.callBack.modSuccess(topic);
    }

    /**
     * 查询主题
     *
     * @return
     */
    @Override
    public void query() {
        // TODO ...网络请求后...

        // TODO 返回数据
        Topic topic = new Topic();
        topic.userId = 267L;
        topic.topicId = 1267L;
        topic.content = "Save you from anything";
        List<Topic> list = new LinkedList<Topic>();
        list.add(topic);
        this.callBack.querySuccess(list);
    }

}
