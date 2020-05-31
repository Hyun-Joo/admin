package com.jjud.admin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jjud.admin.service.MemberService;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/member")
@Api(value="swag-rest-controller", description="HomeController")
public class MemberController extends AbstractController {
	
	
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> selectList(Map<String, Object> map) {
		return makeQueryResultMap(memberService.memberList(map));
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> selectOne(@RequestBody Map<String, Object> map) {
		log.info("fuckyou=========>"+map.toString());
		return makeQueryResultMap(memberService.login(map));
	}
}
