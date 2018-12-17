package com.capgemini.dao;

import com.capgemini.dto.AdminDetail;

public interface AdminDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AdminDetail record);

    int insertSelective(AdminDetail record);

    AdminDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AdminDetail record);

    int updateByPrimaryKey(AdminDetail record);
}