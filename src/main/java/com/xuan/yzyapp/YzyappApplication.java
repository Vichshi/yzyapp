package com.xuan.yzyapp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xuan.yzyapp.admin.mapper")
public class YzyappApplication {
	

	public static void main(String[] args) {
		SpringApplication.run(YzyappApplication.class, args);
	}

}

