package com.rajeev.BusIndia.Bus.India.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
@Entity
@Table(name="passenger")
public class Passenger extends InheritanceId{
	@Column(name="fName")
	private String fName;
	@Column(name="mName")
	private String mName;
	@Column(name="lName")
	private String lName;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private String phone;
	@Column(name="dob")
	private Date dob;
	@Column(name="pinCode")
	private String pinCode;
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getmName() {
		return mName;
	}
	public void setmName(String mName) {
		this.mName = mName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	
	
}
