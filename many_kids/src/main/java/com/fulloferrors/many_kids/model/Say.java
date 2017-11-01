package com.fulloferrors.many_kids.model;

import java.util.Date;
import java.util.List;

public class Say {
    private Integer sayId;

    private User user;

    private Say parent;

    private Source source;

    private String sayName;

    private Date createDate;

    private String sayPosition;

    private String sayWeather;

    private Integer sayState;

    private String sayContent;

    private List<SayComment> sayComments;

    private List<SayImg> sayImgs;

    public Integer getSayId() {
        return sayId;
    }

    public void setSayId(Integer sayId) {
        this.sayId = sayId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Say getParent() {
        return parent;
    }

    public void setParent(Say parent) {
        this.parent = parent;
    }

    public String getSayName() {
        return sayName;
    }

    public void setSayName(String sayName) {
        this.sayName = sayName == null ? null : sayName.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getSayPosition() {
        return sayPosition;
    }

    public void setSayPosition(String sayPosition) {
        this.sayPosition = sayPosition == null ? null : sayPosition.trim();
    }

    public String getSayWeather() {
        return sayWeather;
    }

    public void setSayWeather(String sayWeather) {
        this.sayWeather = sayWeather == null ? null : sayWeather.trim();
    }

    public Integer getSayState() {
        return sayState;
    }

    public void setSayState(Integer sayState) {
        this.sayState = sayState;
    }

    public String getSayContent() {
        return sayContent;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public List<SayComment> getSayComments() {
        return sayComments;
    }

    public void setSayComments(List<SayComment> sayComments) {
        this.sayComments = sayComments;
    }

    public List<SayImg> getSayImgs() {
        return sayImgs;
    }

    public void setSayImgs(List<SayImg> sayImgs) {
        this.sayImgs = sayImgs;
    }

    public void setSayContent(String sayContent) {
        this.sayContent = sayContent == null ? null : sayContent.trim();
    }
}