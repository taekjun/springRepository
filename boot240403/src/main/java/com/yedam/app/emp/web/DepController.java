package com.yedam.app.emp.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.emp.service.DepService;
import com.yedam.app.emp.service.DepVO;

@Controller
public class DepController {
	
	@Autowired
	DepService depService;
	
	// 전체조회
	@GetMapping("depList")
	public String depList(Model model) {
		List<DepVO> list = depService.depList();
		model.addAttribute("depList", list);
		return "dep/list";
	}
	
	// 단건조회
	@GetMapping("depInfo")
	public String depInfo(DepVO depVO, Model model) {
		DepVO findVO = depService.depInfo(depVO);
		model.addAttribute("depInfo", findVO);
		return "dep/info";
	}
	
	// 등록 - 페이지
	@GetMapping("depInsert")
	public String depInsertForm(Model model) {
		model.addAttribute("depVO", new DepVO());
		return "dep/insert";
	}
	
	// 등록 - 처리
	@PostMapping("depInsert")
	public String depInsertProcess(DepVO depVO) {
		int dId = depService.depInsert(depVO);
		String uri = null;
		if(dId > -1) {
			uri = "redirect:depInfo?departmentId="+dId;
		}else {
			uri = "depList";
		}
		return uri;
	}
}
