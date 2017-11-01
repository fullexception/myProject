package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.LoginInfo;

public interface LoginInfoMapper {
    int deleteByPrimaryKey(Integer loginInfoId);

    int insert(LoginInfo record);

    int insertSelective(LoginInfo record);

    LoginInfo selectByPrimaryKey(Integer loginInfoId);

    int updateByPrimaryKeySelective(LoginInfo record);

    int updateByPrimaryKey(LoginInfo record);
}