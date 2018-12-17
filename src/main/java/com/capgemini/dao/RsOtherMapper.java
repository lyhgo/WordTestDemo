package com.capgemini.dao;

import com.capgemini.dto.RsOther;

public interface RsOtherMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsOther record);

    int insertSelective(RsOther record);

    RsOther selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsOther record);

    int updateByPrimaryKeyWithBLOBs(RsOther record);

    int updateByPrimaryKey(RsOther record);
}