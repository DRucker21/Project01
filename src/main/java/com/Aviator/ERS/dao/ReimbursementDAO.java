package com.Aviator.ERS.dao;

import java.util.List;

import com.Aviator.ERS.model.ReimbursementUser;
import com.Aviator.ERS.model.User;

public interface ReimbursementDAO {
	
	public List<ReimbursementUser> getAllReimbursements();
	public List<ReimbursementUser> getPendingReimbursements();
	public List<ReimbursementUser> getAprovedReimbursements();
	public List<ReimbursementUser> getReimbursementByUserId(int userId);
	public List<User> getAllEmployees();
}
