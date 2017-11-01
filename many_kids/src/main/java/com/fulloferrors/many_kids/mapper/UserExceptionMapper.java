package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.UserException;

public interface UserExceptionMapper {
    int deleteByPrimaryKey(Integer exceptionId);

    int insert(UserException record);

    int insertSelective(UserException record);

    UserException selectByPrimaryKey(Integer exceptionId);

    int updateByPrimaryKeySelective(UserException record);

    int updateByPrimaryKey(UserException record);
}