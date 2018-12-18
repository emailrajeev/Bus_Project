package com.rajeev.BusIndia.Bus.India.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
public class User extends InheritanceId{
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
	private String dob;
	@Column(name="pinCode")
	private String pinCode;
	@Column(name="password")
	private String password;
	
	private String conformPassword;
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
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConformPassword() {
		return conformPassword;
	}
	
	
}
