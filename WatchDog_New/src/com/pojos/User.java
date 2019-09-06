package com.pojos;

import java.sql.Date;

public class User 
{
	private String username;
	private String password;
	private String emailId;
	private long phone;
	private Date dob;
	private boolean isAdmin;
	
	public User()
	{
		this.isAdmin=true;
	}
	
	public User(String username, String password, String emailId, long phone, Date dob) 
	{
		super();
		this.username = username;
		this.password = password;
		this.emailId = emailId;
		this.phone = phone;
		this.dob = dob;
		this.isAdmin=true;
	}

	public String getUsername()
	{
		return username;
	}

	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword()
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmailId() 
	{
		return emailId;
	}

	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}

	public long getPhone() 
	{
		return phone;
	}

	public void setPhone(long phone) 
	{
		this.phone = phone;
	}

	public Date getDob() 
	{
		return dob;
	}

	public void setDob(Date dob)
	{
		this.dob = dob;
	}
	
	public boolean isAdmin()
	{
		return isAdmin;
	}

	public void setAdmin(boolean isAdmin)
	{
		this.isAdmin = isAdmin;
	}
}
