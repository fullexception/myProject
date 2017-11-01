package com.fulloferrors.many_kids.model;

import java.util.Date;

public class SayImg {
    private int sayImgId;
    private PhotoAlbum photoAlbum;
    private Say say;

    public int getSayImgId() {
        return sayImgId;
    }

    public void setSayImgId(int sayImgId) {
        this.sayImgId = sayImgId;
    }

    public PhotoAlbum getPhotoAlbum() {
        return photoAlbum;
    }

    public void setPhotoAlbum(PhotoAlbum photoAlbum) {
        this.photoAlbum = photoAlbum;
    }

    public Say getSay() {
        return say;
    }

    public void setSay(Say say) {
        this.say = say;
    }
}