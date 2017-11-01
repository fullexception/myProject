package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.Info;

public interface InfoMapper {
    int deleteByPrimaryKey(Integer infoId);

    int insert(Info record);

    int insertSelective(Info record);

    Info selectByPrimaryKey(Integer infoId);

    int updateByPrimaryKeySelective(Info record);

    int updateByPrimaryKeyWithBLOBs(Info record);

    int updateByPrimaryKey(Info record);
}