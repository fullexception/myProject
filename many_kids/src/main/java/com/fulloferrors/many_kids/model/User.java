package com.fulloferrors.many_kids.model;

import java.util.Date;
import java.util.List;

public class User {
    private int userId;
    private int starId;
    private String loginName;
    private String loginPassword;
    private Date createTime;
    private String nickName;
    private int userState;
    private List<Say> says;
    private List<User> sayCommentUser;
    private List<Article> articles;
    private List<User> articleCommentUser;
    private List<HeadImg> headImgs;
    private List<LoginInfo> loginInfos;
    private List<Info> infos;
    private List<BabyInfo> babyInfos;
    private List<WebStatistics> webStatistics;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getStarId() {
        return starId;
    }

    public void setStarId(int starId) {
        this.starId = starId;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPassword() {
        return loginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        this.loginPassword = loginPassword;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public List<Say> getSays() {
        return says;
    }

    public void setSays(List<Say> says) {
        this.says = says;
    }

    public List<User> getSayCommentUser() {
        return sayCommentUser;
    }

    public void setSayCommentUser(List<User> sayCommentUser) {
        this.sayCommentUser = sayCommentUser;
    }

    public List<Article> getArticles() {
        return articles;
    }

    public void setArticles(List<Article> articles) {
        this.articles = articles;
    }

    public List<User> getArticleCommentUser() {
        return articleCommentUser;
    }

    public void setArticleCommentUser(List<User> articleCommentUser) {
        this.articleCommentUser = articleCommentUser;
    }

    public List<HeadImg> getHeadImgs() {
        return headImgs;
    }

    public void setHeadImgs(List<HeadImg> headImgs) {
        this.headImgs = headImgs;
    }

    public List<LoginInfo> getLoginInfos() {
        return loginInfos;
    }

    public void setLoginInfos(List<LoginInfo> loginInfos) {
        this.loginInfos = loginInfos;
    }

    public List<Info> getInfos() {
        return infos;
    }

    public void setInfos(List<Info> infos) {
        this.infos = infos;
    }

    public List<BabyInfo> getBabyInfos() {
        return babyInfos;
    }

    public void setBabyInfos(List<BabyInfo> babyInfos) {
        this.babyInfos = babyInfos;
    }

    public List<WebStatistics> getWebStatistics() {
        return webStatistics;
    }

    public void setWebStatistics(List<WebStatistics> webStatistics) {
        this.webStatistics = webStatistics;
    }
}
