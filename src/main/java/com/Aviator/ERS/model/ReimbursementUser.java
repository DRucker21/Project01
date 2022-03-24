package com.Aviator.ERS.model;

import java.util.Objects;

public class ReimbursementUser {

	private int userId;
	private float amount;
	private String purpose;
	private String status;
	
	public ReimbursementUser() {
		
	}

	public ReimbursementUser(int userId, float amount, String purpose, String status) {
		super();
		this.userId = userId;
		this.amount = amount;
		this.purpose = purpose;
		this.status = status;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public int hashCode() {
		return Objects.hash(amount, purpose, status, userId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReimbursementUser other = (ReimbursementUser) obj;
		return Float.floatToIntBits(amount) == Float.floatToIntBits(other.amount)
				&& Objects.equals(purpose, other.purpose) && Objects.equals(status, other.status)
				&& userId == other.userId;
	}

	@Override
	public String toString() {
		return "ReimbursmentUser [userId=" + userId + ", amount=" + amount + ", purpose=" + purpose + ", status="
				+ status + "]";
	}
	
}
