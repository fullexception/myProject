package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.Friend;

public interface FriendMapper {
    int deleteByPrimaryKey(Integer friendId);

    int insert(Friend record);

    int insertSelective(Friend record);

    Friend selectByPrimaryKey(Integer friendId);

    int updateByPrimaryKeySelective(Friend record);

    int updateByPrimaryKey(Friend record);
}