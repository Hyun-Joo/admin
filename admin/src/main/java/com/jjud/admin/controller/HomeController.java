package com.jjud.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		log.info("jjud mansei");
		return "너는 쥬드하다";
	}

}
