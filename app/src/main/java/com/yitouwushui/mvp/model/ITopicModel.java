package com.yitouwushui.mvp.model;

import com.yitouwushui.mvp.bean.Topic;

/**
 * Created by yitouwushui on 2016/3/28.
 */
public interface ITopicModel {

    /**
     * 添加Topic
     *
     * @param topic
     */
    void add(Topic topic);

    /**
     * 删除主题
     *
     * @param topic
     */
    void del(Topic topic);

    /**
     * 修改主题
     *
     * @param topicId
     * @param topic
     */
    void mod(Long topicId, Topic topic);

    /**
     * 查询主题
     *
     * @return
     */
    void query();

}
