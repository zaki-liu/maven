package cn.ciacs.maven.module;

import java.sql.Date;

/**
 * 
 * @author CIACs
 * 用户类
 */
public class User {
	private int userId;
	//用户名
	private String username;
	//密码
	private String password;
	//注册日期
	private Date registDate;
	
	public User()
	{
		
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegistDate() {
		return registDate;
	}

	public void setRegistDate(Date registDate) {
		this.registDate = registDate;
	}
	
}
