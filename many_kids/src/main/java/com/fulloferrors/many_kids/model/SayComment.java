package com.fulloferrors.many_kids.model;

import java.util.Date;

public class SayComment {
    private int sayCommentId;
    private Say say;
    private User user;
    private String sayCommentContent;
    private Date createTime;

    public int getSayCommentId() {
        return sayCommentId;
    }

    public void setSayCommentId(int sayCommentId) {
        this.sayCommentId = sayCommentId;
    }

    public Say getSay() {
        return say;
    }

    public void setSay(Say say) {
        this.say = say;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getSayCommentContent() {
        return sayCommentContent;
    }

    public void setSayCommentContent(String sayCommentContent) {
        this.sayCommentContent = sayCommentContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
