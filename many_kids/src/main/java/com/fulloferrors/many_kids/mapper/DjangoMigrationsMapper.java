package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.DjangoMigrations;

public interface DjangoMigrationsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(DjangoMigrations record);

    int insertSelective(DjangoMigrations record);

    DjangoMigrations selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(DjangoMigrations record);

    int updateByPrimaryKey(DjangoMigrations record);
}