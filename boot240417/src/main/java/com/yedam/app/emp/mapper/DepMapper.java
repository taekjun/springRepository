package com.yedam.app.emp.mapper;

import java.util.List;

import com.yedam.app.emp.service.DepVO;

public interface DepMapper {
	// 전체 조회
	public List<DepVO> selectDepAll();
	
	// 단건 조회
	public DepVO selectDep(DepVO depVO);
	
	// 등록
	public int insertDep(DepVO depVO);
}
