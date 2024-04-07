package com.yedam.app.emp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yedam.app.emp.mapper.DepMapper;
import com.yedam.app.emp.service.DepVO;
import com.yedam.app.emp.service.DepService;

@Service
public class DepServiceImpl implements DepService{
	@Autowired
	DepMapper depMapper;
	
	public List<DepVO> depList(){
		return depMapper.selectDepAll();
	}
	
	public DepVO depInfo(DepVO depVO) {
		return depMapper.selectDep(depVO);
	}
	
	public int depInsert(DepVO depVO) {
		int result = depMapper.insertDep(depVO);
		
		if(result == 1) {
			return depVO.getDepartmentId();
		}else {
			return -1;
		}
	}
}
