package com.jjud.admin.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjud.admin.mapper.MemberMapper;
import com.jjud.admin.service.MemberService;

@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper mapper;
	@Override
	public List<Map<String, Object>> memberList(Map<String, Object> map) {
		return mapper.memberList(map);
	}
	@Override
	public Integer login(Map<String, Object> map) {
		return mapper.login(map);
	}

}
