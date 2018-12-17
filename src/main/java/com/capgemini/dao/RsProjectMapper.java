package com.capgemini.dao;

import com.capgemini.dto.RsProject;

public interface RsProjectMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsProject record);

    int insertSelective(RsProject record);

    RsProject selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsProject record);

    int updateByPrimaryKey(RsProject record);
}