package com.xuan.yzyapp.admin.entity;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class EmploeeInfo implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer deptno;
	
	private List<GradeInfo> grade;

}
