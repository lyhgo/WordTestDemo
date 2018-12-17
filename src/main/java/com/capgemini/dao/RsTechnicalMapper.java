package com.capgemini.dao;

import com.capgemini.dto.RsTechnical;

public interface RsTechnicalMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsTechnical record);

    int insertSelective(RsTechnical record);

    RsTechnical selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsTechnical record);

    int updateByPrimaryKeyWithBLOBs(RsTechnical record);

    int updateByPrimaryKey(RsTechnical record);
}