package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.HeadImg;

public interface HeadImgMapper {
    int deleteByPrimaryKey(Integer headImgId);

    int insert(HeadImg record);

    int insertSelective(HeadImg record);

    HeadImg selectByPrimaryKey(Integer headImgId);

    int updateByPrimaryKeySelective(HeadImg record);

    int updateByPrimaryKeyWithBLOBs(HeadImg record);

    int updateByPrimaryKey(HeadImg record);
}