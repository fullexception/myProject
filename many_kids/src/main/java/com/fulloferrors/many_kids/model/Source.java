package com.fulloferrors.many_kids.model;

import java.util.List;

public class Source {
    private int sourceId;
    private String sourceName;
    private List<Article> articles;
    private List<Say> says;

    public int getSourceId() {
        return sourceId;
    }

    public void setSourceId(int sourceId) {
        this.sourceId = sourceId;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<Say> getSays() {
        return says;
    }

    public void setSays(List<Say> says) {
        this.says = says;
    }
}
