package com.capgemini.dao;

import com.capgemini.dto.RsEducation;

public interface RsEducationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsEducation record);

    int insertSelective(RsEducation record);

    RsEducation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsEducation record);

    int updateByPrimaryKeyWithBLOBs(RsEducation record);

    int updateByPrimaryKey(RsEducation record);
}