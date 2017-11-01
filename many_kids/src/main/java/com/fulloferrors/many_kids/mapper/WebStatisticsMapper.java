package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.WebStatistics;

public interface WebStatisticsMapper {
    int deleteByPrimaryKey(Integer webStatisticsId);

    int insert(WebStatistics record);

    int insertSelective(WebStatistics record);

    WebStatistics selectByPrimaryKey(Integer webStatisticsId);

    int updateByPrimaryKeySelective(WebStatistics record);

    int updateByPrimaryKey(WebStatistics record);
}