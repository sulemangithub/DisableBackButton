package com.kpit.utils;

import java.util.HashMap;

import com.kpit.beans.UserBean;

public class DBUtils {

	private static HashMap<String, UserBean> users = new HashMap<>();
	
	public static boolean addUser(UserBean user)
	{
		if(users.containsKey(user.getEmail()))
		{
			return false;
		}
		else
		{
			users.put(user.getEmail(), user);
			return true;
		}
	}
	
	public static UserBean verifyUser(String email,String password)
	{
		if(users.containsKey(email))
		{
			String pass = users.get(email).getPassword();
			if(pass.equals(password))
				return users.get(email);
		}
		
		return null;
	}
	
	
	
}
