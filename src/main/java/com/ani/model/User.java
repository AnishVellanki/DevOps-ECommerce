package com.ani.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

private String userName;
@Id
private String email;
private String password;
private String address;
private String mobileNo;

public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}

public boolean isEnabled() {
	return enabled;
}
public void setEnabled(boolean enabled) {
	this.enabled = enabled;
}

private String role;
private boolean enabled;
}
