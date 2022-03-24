package com.Aviator.ERS.dao;

import java.util.List;

import com.Aviator.ERS.model.User;

public interface LoginDAO {
		public boolean register(User user);
		public boolean validate(String username,String password);
		public List<User> getUsers();
		public List<User> getUserByUserName(String username);
}
