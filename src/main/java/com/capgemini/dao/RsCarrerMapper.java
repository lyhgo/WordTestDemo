package com.capgemini.dao;

import com.capgemini.dto.RsCarrer;

public interface RsCarrerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsCarrer record);

    int insertSelective(RsCarrer record);

    RsCarrer selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsCarrer record);

    int updateByPrimaryKeyWithBLOBs(RsCarrer record);

    int updateByPrimaryKey(RsCarrer record);
}