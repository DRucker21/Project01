package com.Aviator.ERS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Aviator.ERS.model.User;
import com.Aviator.ERS.utility.DBConnection;

public class LoginDAOImpl implements LoginDAO {

	Connection connection = DBConnection.getConnection();

	// @Override
	public boolean register(User user) {
		System.out.println("##Adding user :" + user);
		PreparedStatement statement = null;
		int rows = 0;
		try {
			statement = connection.prepareStatement("insert into newusers values(default,?,?,?,?)");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());
			statement.setString(3, user.getQualification());
			statement.setString(4, user.getGender());
			

			rows = statement.executeUpdate();
			System.out.println(rows + " user registered successfully");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (rows == 0)
			return false;
		else
			return true;
	}

	// @Override
	public boolean validate(String username, String password) {
		boolean userValid = false;
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("select * from newusers where username = ? and password = ? and level = M");
			stat.setString(1, username);
			stat.setString(2, password);

			ResultSet res = stat.executeQuery();
			userValid = res.next();

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return userValid;
	}

	public List<User> getUsers(){
		System.out.println("##Printing All User ");
		List<User> users = new ArrayList<User>();
		Statement state;
		try {
			state = connection.createStatement();
			ResultSet result = state.executeQuery("select * from users");
			while(result.next()) {
				User user = new User();
				user.setUserId(result.getInt(1));
				user.setUsername(result.getString(2));
				user.setPassword(result.getString(3));
				user.setQualification(result.getString(4));
				user.setGender(result.getString(5));
				users.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	public List<User> getUserByUserName(String username) {
		System.out.println("##Printing search users  ");
		List<User> users = new ArrayList<User>();

		Statement stat;
		try {
			stat = connection.createStatement();
			ResultSet res = stat.executeQuery("select * from users where username = '"+username+"'");
			while (res.next()) {
				User user = new User();
				user.setUserId(res.getInt(1));
				user.setUsername(res.getString(2));
				user.setPassword(res.getString(3));
				user.setQualification(res.getString(4));
				user.setGender(res.getString(5));
				users.add(user);

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}


}
