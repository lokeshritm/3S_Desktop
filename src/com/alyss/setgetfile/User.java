package com.alyss.setgetfile;


public class User {
	private int user_id,access_status;
	private String user_name,user_emain,login_id,user_password,user_type,created_date;
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getAccess_status() {
		return access_status;
	}
	public void setAccess_status(int access_status) {
		this.access_status = access_status;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getUser_emain() {
		return user_emain;
	}
	public void setUser_emain(String user_emain) {
		this.user_emain = user_emain;
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	public String getUser_type() {
		return user_type;
	}
	public void setUser_type(String user_type) {
		this.user_type = user_type;
	}
	public String getCreated_date() {
		return created_date;
	}
	public void setCreated_date(String created_date) {
		this.created_date = created_date;
	}
}
