package com.Aviator.ERS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.Aviator.ERS.model.ReimbursementUser;
import com.Aviator.ERS.model.User;
import com.Aviator.ERS.utility.DBConnection;

public class ELoginDAOImpl implements ELoginDAO{
	
	Connection con = DBConnection.getConnection();

	@Override
	public boolean viewPendingReimbursement(int userid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean viewApprovedReimbursement(int userid) {
		
		return false;
	}

	@Override
	public boolean addReimbursment(ReimbursementUser reimburse) {
		PreparedStatement statement = null;
		int rows=0;
		try {
			statement = con.prepareStatement("?,?,?,default");
			statement.setInt(1, reimburse.getUserId());
			statement.setFloat(2, reimburse.getAmount());
			statement.setString(3, reimburse.getPurpose());
			rows = statement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		if(rows == 0)
			return false;
		else
			return true;
	}

	@Override
	public boolean updateAccount(User user) {
		PreparedStatement statement =null;
		try {
			statement = con.prepareStatement("update newusers set userid = 'default', username = ?,"
					                      + " password = ?, qualification = ?, gender = ?, level = 'default'");
			statement.setInt(1, user.getUserId());
			statement.setString(2, user.getUsername());
			statement.setString(3, user.getPassword());
			statement.setString(4,user.getQualification());
			statement.setString(5, user.getGender());
			statement.executeUpdate();
		}catch(SQLException e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean viewAccount(String username) {
		boolean accountExists = false;
		PreparedStatement state;
		try {
			state = con.prepareStatement("select * from newusers where userid = ? and level = 'E'");
			state.setString(1, username);
			ResultSet result = state.executeQuery();
			while(accountExists = result.next()) {
				User user = new User();
				user.setUserId(result.getInt(1));
				user.setUsername(result.getString(2));
				user.setPassword(result.getString(3));
				user.setQualification(result.getString(4));
				user.setGender(result.getString(5));
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return accountExists;
	}
	@Override
	public boolean validateE(String username, String password) {
		boolean userValid = false;
		PreparedStatement state;
		try {
			state = con.prepareStatement("select * from newusers where username = ? and password = ? and level = 'E'");
			state.setString(1, username);
			state.setString(2, password);
			ResultSet result = state.executeQuery();
			userValid = result.next();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return userValid;
	}

}
