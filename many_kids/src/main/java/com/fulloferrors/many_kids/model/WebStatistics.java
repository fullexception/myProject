package com.fulloferrors.many_kids.model;

import java.util.Date;

public class WebStatistics {
    private Integer webStatisticsId;

    private String ip;

    private Date loginDate;

    private User loginUser;

    public Integer getWebStatisticsId() {
        return webStatisticsId;
    }

    public void setWebStatisticsId(Integer webStatisticsId) {
        this.webStatisticsId = webStatisticsId;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public User getLoginUser() {
        return loginUser;
    }

    public void setLoginUser(User loginUser) {
        this.loginUser = loginUser;
    }
}