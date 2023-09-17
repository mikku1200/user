package com.travelleraas.user.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "uesr_details")
public class UserDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "username")
	private String userId;
	@Column(name = "Name")
	private String name;
	@Column(name = "Mobile_no")
	private String mobileNo;
	@Column(name = "email_id")
	private String emailId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
	public UserDetail() {
		super();
	}
	public UserDetail(int id, String userId, String name, String mobileNo, String emailId) {
		super();
		this.id = id;
		this.userId = userId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}
	
	

}
