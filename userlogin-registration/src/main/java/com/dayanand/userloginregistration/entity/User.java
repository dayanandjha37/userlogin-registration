package com.dayanand.userloginregistration.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uid;
	private String rname;
	private String uname;
	private String upwd;
	private String uemail;
	private String umobile;
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getRname() {
		return rname;
	}
	public void setRname(String rname) {
		this.rname = rname;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUmobile() {
		return umobile;
	}
	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", rname=" + rname + ", uname=" + uname + ", upwd=" + upwd + ", uemail=" + uemail
				+ ", umobile=" + umobile + "]";
	}

}
