package com.jjud.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jjud.admin.VO.UserVO;

@Repository
@Mapper
public interface TestMapper {

	List<UserVO> test();

}
