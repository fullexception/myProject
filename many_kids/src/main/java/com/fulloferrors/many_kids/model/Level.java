package com.fulloferrors.many_kids.model;

import java.util.List;

public class Level {
    private Integer levelId;

    private String levelName;

    private List<LoginInfo> loginInfos;

    public Integer getLevelId() {
        return levelId;
    }

    public void setLevelId(Integer levelId) {
        this.levelId = levelId;
    }

    public String getLevelName() {
        return levelName;
    }

    public List<LoginInfo> getLoginInfos() {
        return loginInfos;
    }

    public void setLoginInfos(List<LoginInfo> loginInfos) {
        this.loginInfos = loginInfos;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName == null ? null : levelName.trim();
    }
}