package com.xuan.yzyapp.admin.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class GradeInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String id;
	private String name;
	private Integer time;
	private String type;
	private Double price;
	
}
