package com.lovely.ssm.redis.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lovely.ssm.redis.dao.DeptMapper;
import com.lovely.ssm.redis.entitys.Dept;
import com.lovely.ssm.redis.service.DeptService;

@Service
public class DeptServiceImpl implements DeptService{

	@Autowired
	private DeptMapper deptMapper;
	
	@Override
	public Integer saveDept(Dept record){
		return deptMapper.insert(record);
	}

	@Override
	public Dept getDept(Integer deptid) {
		return deptMapper.
				selectByPrimaryKey(deptid);
	}
}
