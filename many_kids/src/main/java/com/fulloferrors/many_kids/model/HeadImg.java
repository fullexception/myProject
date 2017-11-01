package com.fulloferrors.many_kids.model;

import java.util.Date;

public class HeadImg {
    private Integer headImgId;

    private User user;

    private Date createDate;

    private byte[] headImg;

    public Integer getHeadImgId() {
        return headImgId;
    }

    public void setHeadImgId(Integer headImgId) {
        this.headImgId = headImgId;
    }

    public User getUser() {
        return user;
    }

    public void setUserId(User user) {
        this.user = user;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public byte[] getHeadImg() {
        return headImg;
    }

    public void setHeadImg(byte[] headImg) {
        this.headImg = headImg;
    }
}