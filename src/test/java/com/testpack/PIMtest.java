package com.testpack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.pageclass.Employeelist;
import com.pageclass.admin;
import com.pageclass.adminlink;
import com.pageclass.login;
import com.pageclass.page;

import parentclass.Apputils;

public class PIMtest extends Apputils{
	
	
login  obj;
admin ad;
page pg;

	public PIMtest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		intilization();
		obj=new login();
		ad=obj.loginOrange(prop.getProperty("username"), prop.getProperty("password"));
		pg=new page();
		
		
	}


	
	@Test(priority=1)
	public void pimtest(){
		
		
		pg.clickonpimlink();
		
	}
	

	
	@Test(priority=2)
	public void Addemployeetest(){
		
		pg.clickonpimlink();
		pg.Addemployee("kujj", "punju");
		
		
		
	}
		
		
	@AfterMethod
	public void closeapp(){
		driver.close();
	}
	
	




	
}
