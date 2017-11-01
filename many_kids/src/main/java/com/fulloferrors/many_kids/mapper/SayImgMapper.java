package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.SayImg;

public interface SayImgMapper {
    int deleteByPrimaryKey(Integer sayImgId);

    int insert(SayImg record);

    int insertSelective(SayImg record);

    SayImg selectByPrimaryKey(Integer sayImgId);

    int updateByPrimaryKeySelective(SayImg record);

    int updateByPrimaryKeyWithBLOBs(SayImg record);

    int updateByPrimaryKey(SayImg record);
}