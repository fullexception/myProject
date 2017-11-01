package com.fulloferrors.many_kids.model;

import java.util.Date;
import java.util.List;

public class Article {
    private Integer articleId;

    private User host;

    private Article parentArticle;

    private Source source;

    private ArticleGroup articleGroup;

    private String articleTitle;

    private Date createDate;

    private String weather;

    private Integer articleState;

    private String articleContent;

    private List<ArticleComment> articleComments;

    private List<ArticleImg> articleImgs;

    public Integer getArticleId() {
        return articleId;
    }

    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    public User getHost() {
        return host;
    }

    public void setHostId(User host) {
        this.host = host;
    }

    public Article getParentArticle() {
        return parentArticle;
    }

    public void setParentArticle(Article parentArticle) {
        this.parentArticle = parentArticle;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather == null ? null : weather.trim();
    }

    public Integer getArticleState() {
        return articleState;
    }

    public void setArticleState(Integer articleState) {
        this.articleState = articleState;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }

    public void setHost(User host) {
        this.host = host;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public ArticleGroup getArticleGroup() {
        return articleGroup;
    }

    public void setArticleGroup(ArticleGroup articleGroup) {
        this.articleGroup = articleGroup;
    }
}