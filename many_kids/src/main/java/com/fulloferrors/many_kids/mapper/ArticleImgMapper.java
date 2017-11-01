package com.fulloferrors.many_kids.mapper;

import com.fulloferrors.many_kids.model.ArticleImg;

public interface ArticleImgMapper {
    int deleteByPrimaryKey(Integer articleImgId);

    int insert(ArticleImg record);

    int insertSelective(ArticleImg record);

    ArticleImg selectByPrimaryKey(Integer articleImgId);

    int updateByPrimaryKeySelective(ArticleImg record);

    int updateByPrimaryKeyWithBLOBs(ArticleImg record);

    int updateByPrimaryKey(ArticleImg record);
}