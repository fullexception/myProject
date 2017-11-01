package com.fulloferrors.many_kids.model;

import java.util.List;

public class FriendGroup {
    private int friendGroupId;
    private String friendGroupName;
    private List<Friend> friends;

    public int getFriendGroupId() {
        return friendGroupId;
    }

    public void setFriendGroupId(int friendGroupId) {
        this.friendGroupId = friendGroupId;
    }

    public String getFriendGroupName() {
        return friendGroupName;
    }

    public List<Friend> getFriends() {
        return friends;
    }

    public void setFriends(List<Friend> friends) {
        this.friends = friends;
    }

    public void setFriendGroupName(String friendGroupName) {
        this.friendGroupName = friendGroupName;
    }
}
