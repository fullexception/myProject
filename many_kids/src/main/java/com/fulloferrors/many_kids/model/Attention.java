package com.fulloferrors.many_kids.model;

public class Attention {
    private Integer attentionId;

    private User hostUser;

    private User hostAttentionUser;

    private Integer hostAttentionArticleId;

    public Integer getAttentionId() {
        return attentionId;
    }

    public void setAttentionId(Integer attentionId) {
        this.attentionId = attentionId;
    }

    public User getHostUser() {
        return hostUser;
    }

    public void setHostUser(User hostUser) {
        this.hostUser = hostUser;
    }

    public User getHostAttentionUser() {
        return hostAttentionUser;
    }

    public void setHostAttentionUser(User hostAttentionUser) {
        this.hostAttentionUser = hostAttentionUser;
    }

    public Integer getHostAttentionArticleId() {
        return hostAttentionArticleId;
    }

    public void setHostAttentionArticleId(Integer hostAttentionArticleId) {
        this.hostAttentionArticleId = hostAttentionArticleId;
    }
}