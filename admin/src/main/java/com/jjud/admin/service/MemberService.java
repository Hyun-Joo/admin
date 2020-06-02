package com.jjud.admin.service;

import java.util.List;
import java.util.Map;

import com.jjud.admin.VO.User;

public interface MemberService {

	public abstract List<Map<String, Object>> memberList(Map<String, Object> map);

	public abstract Integer login(Map<String, Object> map);
	
	public abstract void signup(User user);

}
