package com.fulloferrors.many_kids.model;

import java.util.List;

public class PhotoAlbum {
    private int photoAlbumId;
    private PhotoAlbumGroup imgMenu;
    private String photoRemark;
    private String photoUrl;
    private List<SayImg> sayImgs;
    private List<ArticleImg> articleImgs;

    public int getPhotoAlbumId() {
        return photoAlbumId;
    }

    public void setPhotoAlbumId(int photoAlbumId) {
        this.photoAlbumId = photoAlbumId;
    }

    public PhotoAlbumGroup getImgMenu() {
        return imgMenu;
    }

    public void setImgMenu(PhotoAlbumGroup imgMenu) {
        this.imgMenu = imgMenu;
    }

    public String getPhotoRemark() {
        return photoRemark;
    }

    public void setPhotoRemark(String photoRemark) {
        this.photoRemark = photoRemark;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public List<SayImg> getSayImgs() {
        return sayImgs;
    }

    public void setSayImgs(List<SayImg> sayImgs) {
        this.sayImgs = sayImgs;
    }

    public List<ArticleImg> getArticleImgs() {
        return articleImgs;
    }

    public void setArticleImgs(List<ArticleImg> articleImgs) {
        this.articleImgs = articleImgs;
    }
}
