package com.jjud.admin.VO;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class UserVO {
	private Integer id; 
	private String account;
	private String password;
	private String status; 
	private Timestamp createdAt; 
	private String email; 
	private String phoneNumber;
	private Timestamp registeredAt;
	private Timestamp unregisteredAt;
	private String createdBy;
	private Timestamp updatedAt;
	private String updatedBy;
}
