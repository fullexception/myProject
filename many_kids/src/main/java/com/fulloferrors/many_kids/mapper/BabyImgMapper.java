package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.BabyImg;

public interface BabyImgMapper {
    int deleteByPrimaryKey(Integer babyImgId);

    int insert(BabyImg record);

    int insertSelective(BabyImg record);

    BabyImg selectByPrimaryKey(Integer babyImgId);

    int updateByPrimaryKeySelective(BabyImg record);

    int updateByPrimaryKey(BabyImg record);
}