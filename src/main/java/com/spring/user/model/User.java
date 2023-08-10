package com.spring.user.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@Document(collection = "UserDetails/User")
public class User {
	
	@Id
	private Integer id;
	private String userName;
	private String password;
//	public String getId() {
//		// TODO Auto-generated method stub
//		return id;
//	}
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

}
