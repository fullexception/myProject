package com.fulloferrors.many_kids.model;

import java.util.Date;

public class ArticleComment {
    private int articleCommentId;
    private Article article;
    private User user;
    private String articleCommentContent;
    private Date createTime;

    public int getArticleCommentId() {
        return articleCommentId;
    }

    public void setArticleCommentId(int articleCommentId) {
        this.articleCommentId = articleCommentId;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getArticleCommentContent() {
        return articleCommentContent;
    }

    public void setArticleCommentContent(String articleCommentContent) {
        this.articleCommentContent = articleCommentContent;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
