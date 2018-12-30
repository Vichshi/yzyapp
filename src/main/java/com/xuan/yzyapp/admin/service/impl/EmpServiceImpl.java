package com.xuan.yzyapp.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xuan.yzyapp.admin.entity.EmploeeInfo;
import com.xuan.yzyapp.admin.mapper.EmpMapper;
import com.xuan.yzyapp.admin.service.EmpService;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpMapper empMapper;

	@Override
	public EmploeeInfo queryJson(Integer number) {
		
		return empMapper.findJson(number);
	}
	
	
}
