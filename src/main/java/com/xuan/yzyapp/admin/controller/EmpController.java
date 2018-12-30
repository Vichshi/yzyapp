package com.xuan.yzyapp.admin.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xuan.yzyapp.YzyappApplication;
import com.xuan.yzyapp.admin.service.EmpService;

@RestController
@RequestMapping("/emp")
public class EmpController {
	
	private final Logger log = LoggerFactory.getLogger(YzyappApplication.class);
	
	@Autowired
	private EmpService empService;
	
	@RequestMapping("/path/{no}")
	public Object queryInfo(@PathVariable Integer no) {
		log.info("入参： "+no);
		return empService.queryJson(no);
	}

}
