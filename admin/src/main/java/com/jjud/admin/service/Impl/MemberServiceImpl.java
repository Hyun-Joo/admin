package com.jjud.admin.service.Impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjud.admin.VO.User;
import com.jjud.admin.config.Constants;
import com.jjud.admin.mapper.MemberMapper;
import com.jjud.admin.service.MemberService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class MemberServiceImpl implements MemberService{

	@Autowired
	MemberMapper mapper;
	
	@Override
	public List<Map<String, Object>> memberList(Map<String, Object> map) {
		List<Map<String, Object>> list = null;
		try {
			if(map != null) {
				list = mapper.memberList(map);
			}
		} catch (Exception e) {
			log.error("리스트 조회 실패! => "+e.getMessage());
			throw new RuntimeException();
		}
		return list;
	}
	
	@Override
	public Integer login(Map<String, Object> map) {
		Integer count = null;
		try {
			if(map != null) {
				count = mapper.login(map);
			}
		} catch (Exception e) {
			log.error("로그인 실패! => "+e.getMessage());
			throw new RuntimeException();
		}
		return count;
	}
	
	@Override
	public void signup(User user) {
		try {
			if(user != null) {
				user.setStatus(Constants.LOGOUT);
				user.setCreatedBy(Constants.ADMIN);
				mapper.signup(user);
			}
		} catch (Exception e) {
			log.error("사용자등록 실패! => "+e.getMessage());
			throw new RuntimeException();
		}
	}

}
