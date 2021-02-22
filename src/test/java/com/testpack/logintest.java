package com.testpack;





import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageclass.admin;
import com.pageclass.login;


import parentclass.Apputils;

public class logintest extends Apputils {
	login  obj;
	
	admin admlogin;
	
	public logintest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		intilization();
		
		
	
	}
	
	@Test(priority=1)
	public void Logintest(){
		 obj=new login();
		 admlogin=obj.loginOrange(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=2)
	
	public void imagetest(){
		boolean flag=obj.validateHrmimage();
		Assert.assertTrue(flag);
	
		
	}	
		
	@AfterMethod
	public void closeapp(){
		driver.close();
	}
	
	}




