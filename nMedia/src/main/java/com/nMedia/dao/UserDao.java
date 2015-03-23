package com.nMedia.dao;

import java.util.List;

import com.nMedia.bean.User;

public interface UserDao {

	public int addUser(User user);
	
	List<User> getAllUsers();  
}
