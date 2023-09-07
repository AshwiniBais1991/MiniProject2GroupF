package com.ecommerce.miniproject;

public class RegisteredUser {
	private int userid ;
	private String firstname ; 
    private String lastname ;
    private String username ;
    private String passwords ;
    private String city ;
    private String mailid ;
    private String mobilenumber ;
    private int roleid ;
	public RegisteredUser(int userid, String firstname, String lastname, String username, String passwords, String city, String mailid,
			String mobilenumber ,int roleid ) {
		
		this.userid = userid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.username = username;
		this.passwords = passwords;
		this.city= city;
		this.mailid = mailid;
		this.roleid = roleid;
		
	}
	public RegisteredUser() {
		
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPasswords() {
		return passwords;
	}
	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
    

}
