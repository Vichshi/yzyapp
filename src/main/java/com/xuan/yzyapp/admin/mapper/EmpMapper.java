package com.xuan.yzyapp.admin.mapper;

import org.springframework.stereotype.Repository;

import com.xuan.yzyapp.admin.entity.EmploeeInfo;

@Repository
public interface EmpMapper {

	EmploeeInfo findJson(Integer number);
}
