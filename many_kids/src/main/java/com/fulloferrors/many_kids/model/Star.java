package com.fulloferrors.many_kids.model;

import java.util.List;

public class Star {
    private Integer starId;

    private String name;

    private String startTime;

    private String endTime;

    private List<User> users;

    private List<BabyInfo> babyInfos;

    public Integer getStarId() {
        return starId;
    }

    public void setStarId(Integer starId) {
        this.starId = starId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getEndTime() {
        return endTime;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public List<BabyInfo> getBabyInfos() {
        return babyInfos;
    }

    public void setBabyInfos(List<BabyInfo> babyInfos) {
        this.babyInfos = babyInfos;
    }

    public void setEndTime(String endTime) {

        this.endTime = endTime == null ? null : endTime.trim();
    }
}