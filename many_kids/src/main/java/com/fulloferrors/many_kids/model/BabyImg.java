package com.fulloferrors.many_kids.model;

import java.util.Date;

public class BabyImg {
    private Integer babyImgId;

    private BabyInfo babyInfo;

    private String babyImgContent;

    private Date createDate;

    private String head;

    private String content;

    public Integer getBabyImgId() {
        return babyImgId;
    }

    public void setBabyImgId(Integer babyImgId) {
        this.babyImgId = babyImgId;
    }

    public BabyInfo getBabyInfo() {
        return babyInfo;
    }

    public void setBabyInfo(BabyInfo babyInfo) {
        this.babyInfo = babyInfo;
    }

    public String getBabyImgContent() {
        return babyImgContent;
    }

    public void setBabyImgContent(String babyImgContent) {
        this.babyImgContent = babyImgContent == null ? null : babyImgContent.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head == null ? null : head.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}