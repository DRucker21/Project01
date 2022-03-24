package com.Aviator.ERS.dao;

import com.Aviator.ERS.model.ReimbursementUser;
import com.Aviator.ERS.model.User;

public interface ELoginDAO {
	
	public boolean validateE(String username, String password);
	public boolean viewPendingReimbursement(int userid);
	public boolean viewApprovedReimbursement(int userid);
	public boolean addReimbursment(ReimbursementUser reimburse);
	public boolean updateAccount(User user);
	public boolean viewAccount(String username);
}
