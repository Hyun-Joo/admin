package com.jjud.admin.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjud.admin.VO.UserVO;
import com.jjud.admin.mapper.TestMapper;
import com.jjud.admin.service.TestService;

@Service
public class TestServiceImpl implements TestService {

	@Autowired
	TestMapper mapper;

	@Override
	public List<UserVO> test() {
		return mapper.test();
	}
	
	
}
