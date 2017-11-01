package com.fulloferrors.many_kids.model;

public class Friend {
    private Integer friendId;

    private User host;

    private User hostFriend;

    private FriendGroup friendGroup;

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public User getHost() {
        return host;
    }

    public void setHost(Friend hostId) {
        this.host = host;
    }

    public User getHostFriend() {
        return hostFriend;
    }

    public FriendGroup getFriendGroup() {
        return friendGroup;
    }

    public void setFriendGroup(FriendGroup friendGroup) {
        this.friendGroup = friendGroup;
    }

    public void setHostFriend(User hostFriend) {
        this.hostFriend = hostFriend;
    }
}