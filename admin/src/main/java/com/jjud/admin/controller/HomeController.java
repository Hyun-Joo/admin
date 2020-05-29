package com.jjud.admin.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjud.admin.service.TestService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class HomeController extends AbstractController {
	
	@Autowired
	TestService testService;
	
	@GetMapping("/")
	public String home() {
		log.info("jjud mansei");
		return "너는 쥬드하다";
	}

	@GetMapping("/test")
	public Map<String, Object> selectList(Map<String, Object> map) {
		return makeQueryResultMap(testService.test(map));
	}
	
	/*	@RequestMapping(value = "/members", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> selectList() {
		return makeQueryResultMap(memberService.selectList());
	}
	
	@RequestMapping(value = "/member/{rowId}", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> selectOne(@PathVariable String rowId) {
		Map<String, Object> map = new dHashMap<String, Object>();
		map.put("rowId", rowId);
		return makeQueryResultMap(memberService.selectOne(map));
	}

	@RequestMapping(value = "/member", method = RequestMethod.POST)
	@ResponseBody
	public Map<String, Object> insert(String paramStr) throws Exception {
		return makeResultMap(memberService.insert((Member)getModel(paramStr, Member.class)));
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.PATCH)
	@ResponseBody
	public Map<String, Object> update(String paramStr) throws Exception {
		return makeResultMap(memberService.update((Member)getModel(paramStr, Member.class)));
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.DELETE)
	@ResponseBody
	public Map<String, Object> delete(String paramStr) throws Exception {
		return makeResultMap(memberService.delete((Member)getModel(paramStr, Member.class)));
	}*/
}
