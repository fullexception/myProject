package com.fulloferrors.many_kids.model;

import java.util.Date;

public class LoginInfo {
    private Integer loginInfoId;

    private Level level;

    private User user;

    private Double loginTime;

    private Date lastLoginTime;

    public Integer getLoginInfoId() {
        return loginInfoId;
    }

    public void setLoginInfoId(Integer loginInfoId) {
        this.loginInfoId = loginInfoId;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Double loginTime) {
        this.loginTime = loginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }
}