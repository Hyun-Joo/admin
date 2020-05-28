package com.jjud.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjud.admin.VO.UserVO;
import com.jjud.admin.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/")
	public String home() {
		log.info("jjud mansei");
		return "너는 쥬드하다";
	}

	@GetMapping("/test")
	public List<UserVO> test(){
		return testService.test();
	}
}
