package com.lovely.ssm.redis.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lovely.ssm.redis.entitys.Dept;
import com.lovely.ssm.redis.service.DeptService;

@Controller
public class DeptController {

	@Autowired
	private DeptService deptService;

	@ResponseBody
	@RequestMapping(value = "/dept", method = RequestMethod.POST)
	public String saveDept(Dept dept) {
		if (deptService.saveDept(dept) > 0) {
			return "增加成功!";
		}else{
			return "增加失败!";
		}
	}
	
	@ResponseBody
	@RequestMapping(value = "/dept/{deptId}", method = RequestMethod.GET)
	public Dept getDept(@PathVariable("deptId")Integer deptId) {
		return deptService.getDept(deptId);
	}

}
