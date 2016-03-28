package com.yitouwushui.mvp.iview;

import com.yitouwushui.mvp.bean.Topic;

import java.util.List;

/**
 * Created by yitouwushui on 2016/3/28.
 */
public interface IMvpView {
    /**
     * 添加成功
     *
     * @param topic
     */
    void addSuccess(Topic topic);

    /**
     * 删除成功
     *
     * @param topic
     */
    void delSuccess(Topic topic);

    /**
     * 修改成功
     *
     * @param newTopic
     */
    void modSuccess(Topic newTopic);

    /**
     * 查询成功
     *
     * @return
     */
    void querySuccess(List<Topic> topics);

    /**
     * 发生错误
     */
    void error();

}

