package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.BabyInfo;

public interface BabyInfoMapper {
    int deleteByPrimaryKey(Integer babyInfoId);

    int insert(BabyInfo record);

    int insertSelective(BabyInfo record);

    BabyInfo selectByPrimaryKey(Integer babyInfoId);

    int updateByPrimaryKeySelective(BabyInfo record);

    int updateByPrimaryKey(BabyInfo record);
}