package com.lovely.ssm.redis.service;

import com.lovely.ssm.redis.entitys.Dept;

public interface DeptService {
	
	public Integer saveDept(Dept record);
	
	public Dept getDept(Integer id);
}
