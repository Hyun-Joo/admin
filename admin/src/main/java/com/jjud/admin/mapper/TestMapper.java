package com.jjud.admin.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jjud.admin.VO.UserVO;

@Repository
@Mapper
public interface TestMapper {

	List<UserVO> test(Map<String, Object> map);

}
