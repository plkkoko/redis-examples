package com.lovely.ssm.redis.dao;


import com.lovely.ssm.redis.entitys.Emp;

public interface EmpMapper {
    int deleteByPrimaryKey(Integer empid);

    int insert(Emp record);

    int insertSelective(Emp record);

    Emp selectByPrimaryKey(Integer empid);

    int updateByPrimaryKeySelective(Emp record);

    int updateByPrimaryKey(Emp record);
}