package com.Aviator.ERS.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.Aviator.ERS.model.ReimbursementUser;
import com.Aviator.ERS.model.User;
import com.Aviator.ERS.utility.DBConnection;

public class ReimbursementDAOImpl implements ReimbursementDAO{
	
	Connection con = DBConnection.getConnection();

	@Override
	public List<ReimbursementUser> getAllReimbursements() {
		List<ReimbursementUser> rusers = new ArrayList<ReimbursementUser>();
		Statement state;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery("select * from newreimbursment");
			while(result.next()) {
				ReimbursementUser user = new ReimbursementUser();
				user.setUserId(result.getInt(1));
				user.setAmount(result.getFloat(2));
				user.setPurpose(result.getString(3));
				user.setStatus(result.getString(4));
				rusers.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rusers;
	}

	@Override
	public List<ReimbursementUser> getReimbursementByUserId(int userId) {
		List<ReimbursementUser> rusers = new ArrayList<ReimbursementUser>();
		Statement state;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery("select * from reimbursment where userid = ?");
			while(result.next()) {
				ReimbursementUser user = new ReimbursementUser();
				user.setUserId(result.getInt(1));
				user.setAmount(result.getFloat(2));
				user.setPurpose(result.getString(3));
				user.setStatus(result.getString(4));
				rusers.add(user);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rusers;
	}

	@Override
	public List<User> getAllEmployees() {
		List<User> users = new ArrayList<User>();
		Statement state;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery("select * from newusers");
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

	@Override
	public List<ReimbursementUser> getPendingReimbursements() {
		List<ReimbursementUser> rusers = new ArrayList<ReimbursementUser>();
		Statement state;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery("select * from newreimbursment where status = pending");
			while(result.next()) {
				ReimbursementUser user = new ReimbursementUser();
				user.setUserId(result.getInt(1));
				user.setAmount(result.getFloat(2));
				user.setPurpose(result.getString(3));
				user.setStatus(result.getString(4));
				rusers.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rusers;
	}

	@Override
	public List<ReimbursementUser> getAprovedReimbursements() {
		List<ReimbursementUser> rusers = new ArrayList<ReimbursementUser>();
		Statement state;
		try {
			state = con.createStatement();
			ResultSet result = state.executeQuery("select * from newreimbursment where status = approved ");
			while(result.next()) {
				ReimbursementUser user = new ReimbursementUser();
				user.setUserId(result.getInt(1));
				user.setAmount(result.getFloat(2));
				user.setPurpose(result.getString(3));
				user.setStatus(result.getString(4));
				rusers.add(user);
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
		return rusers;
	}



}
