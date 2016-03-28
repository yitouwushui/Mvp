package com.yitouwushui.mvp.bean;

/**
 * Created by yitouwushui on 2016/3/28.
 */
public class Topic {

    /**
     * 用户Id
     */
    public Long userId;

    /**
     * 主题Id
     */
    public Long topicId;

    /**
     * 主题内容
     */
    public String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "content='" + content + '\'' +
                ", userId=" + userId +
                ", topicId=" + topicId +
                '}';
    }
}