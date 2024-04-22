package com.yedam.app.emp.service;

import lombok.Data;

@Data
public class DepVO {
	private Integer departmentId;
	private String departmentName;
	private int managerId;
	private int locationId;
}
