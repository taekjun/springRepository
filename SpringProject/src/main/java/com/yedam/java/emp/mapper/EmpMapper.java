package com.yedam.java.emp.mapper;

import java.util.List;

import com.yedam.java.emp.service.EmpVO;

//인터페이스는 bean등록불가
public interface EmpMapper {
	public List<EmpVO> selectEmpAll();
}
