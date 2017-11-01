package com.fulloferrors.many_kids.model;

import java.util.Date;

public class ArticleImg {
    private int articleImgId;
    private PhotoAlbum photoAlbum;
    private Article article;

    public int getArticleImgId() {
        return articleImgId;
    }

    public void setArticleImgId(int articleImgId) {
        this.articleImgId = articleImgId;
    }

    public PhotoAlbum getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(PhotoAlbum photoAlbum) {
        this.photoAlbum = photoAlbum;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }
}