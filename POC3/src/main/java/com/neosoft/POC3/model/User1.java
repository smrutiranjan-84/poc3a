package com.neosoft.POC3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User1 {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	@Column
	//(name="first_name")
	private String userFirstName;
	@Column
	//(name="last_name")
	private String surName;
	@Column
	//(name="dob")
	private String dob;
	@Column
	//(name="joining_date")
	private String dateOfJoining;
	@Column
	//(name="pincode")
	private String pinCode;
	
	/*
	 * public User1(int userId, String userFirstName, String surName, String dob,
	 * String dateOfJoining, String pinCode) { super(); this.userId = userId;
	 * this.userFirstName = userFirstName; this.surName = surName; this.dob = dob;
	 * this.dateOfJoining = dateOfJoining; this.pinCode = pinCode; }
	 */
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}	

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
	

}
