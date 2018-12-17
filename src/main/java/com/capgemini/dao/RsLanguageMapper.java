package com.capgemini.dao;

import com.capgemini.dto.RsLanguage;

public interface RsLanguageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsLanguage record);

    int insertSelective(RsLanguage record);

    RsLanguage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsLanguage record);

    int updateByPrimaryKey(RsLanguage record);
}