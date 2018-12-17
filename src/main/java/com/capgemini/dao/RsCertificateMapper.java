package com.capgemini.dao;

import com.capgemini.dto.RsCertificate;

public interface RsCertificateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RsCertificate record);

    int insertSelective(RsCertificate record);

    RsCertificate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RsCertificate record);

    int updateByPrimaryKeyWithBLOBs(RsCertificate record);

    int updateByPrimaryKey(RsCertificate record);
}