package com.fulloferrors.many_kids.model;

import java.util.Date;
import java.util.List;

public class BabyInfo {
    private Integer babyInfoId;

    private User parent;

    private Star star;

    private String babyNickName;

    private Integer babySex;

    private List<BabyImg> babyImgs;

    private Date babyBirthday;

    public Integer getBabyInfoId() {
        return babyInfoId;
    }

    public void setBabyInfoId(Integer babyInfoId) {
        this.babyInfoId = babyInfoId;
    }

    public List<BabyImg> getBabyImgs() {
        return babyImgs;
    }

    public void setBabyImgs(List<BabyImg> babyImgs) {
        this.babyImgs = babyImgs;
    }

    public User getParent() {
        return parent;
    }

    public void setParent(User parent) {
        this.parent = parent;
    }

    public Star getStar() {
        return star;
    }

    public void setStar(Star star) {
        this.star = star;
    }

    public String getBabyNickName() {
        return babyNickName;
    }

    public void setBabyNickName(String babyNickName) {
        this.babyNickName = babyNickName == null ? null : babyNickName.trim();
    }

    public Integer getBabySex() {
        return babySex;
    }

    public void setBabySex(Integer babySex) {
        this.babySex = babySex;
    }

    public Date getBabyBirthday() {
        return babyBirthday;
    }

    public void setBabyBirthday(Date babyBirthday) {
        this.babyBirthday = babyBirthday;
    }
}