package com.yedam.app.emp.service;

import java.util.List;

public interface DepService {
	// 전체조회
	public List<DepVO> depList();
	
	// 단건조회
	public DepVO depInfo(DepVO depVO);
	
	// 등록
	public int depInsert(DepVO depVO);
}
