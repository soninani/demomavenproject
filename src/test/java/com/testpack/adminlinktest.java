package com.testpack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageclass.admin;
import com.pageclass.adminlink;
import com.pageclass.login;

import parentclass.Apputils;
import utils.utilsclass;

public class adminlinktest extends Apputils {
	
login  obj;
admin ad;
adminlink admi;



	
	public adminlinktest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		intilization();
		obj=new login();
		ad=obj.loginOrange(prop.getProperty("username"), prop.getProperty("password"));
		admi=ad.Adlinkisavilable();
		
	}

	
	
	
	
	
	
	@Test
	public void admintest(){
		admi=new adminlink();
		admi.adminlinkdispayed();
	
		
	}
		
	@AfterMethod
	public void closeapp(){
		driver.close();
	}
	
	




	

}
