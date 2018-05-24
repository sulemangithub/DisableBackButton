package com.kpit.beans;

import com.kpit.utils.DBUtils;

public class UserBean {
	
	private String email;
	private String password;
	private String name;
	private int age;
	private String phone;
	private String city;
	
	public UserBean() {
		// TODO Auto-generated constructor stub
	}

	public UserBean(String email, String password, String name, int age, String phone, String city) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.city = city;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	
	public String validate()
	{
		UserBean u = DBUtils.verifyUser(email, password);
			
		if(u!=null)
		{

			this.name = u.name;
			this.age = u.age;
			this.city = u.city;
			this.phone = u.phone;
			return "home.jsp";
		}
		else
			return "login.html";
	}
	
	public String register()
	{
		if(DBUtils.addUser(this))
			return "success.jsp";
		else
			return "register.html";
	}

}
