package com.capgemini.dao;

import com.capgemini.dto.RsIndustry;

public interface RsIndustryMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsIndustry record);

    int insertSelective(RsIndustry record);

    RsIndustry selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsIndustry record);

    int updateByPrimaryKeyWithBLOBs(RsIndustry record);

    int updateByPrimaryKey(RsIndustry record);
}