package com.testpack;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageclass.admin;
import com.pageclass.login;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import parentclass.Apputils;
import utils.utilsclass;

public class Adminpagetest extends Apputils{

	login obj;
	admin ad;
	
	
	public Adminpagetest(){
		super();
	}
	
	@BeforeMethod
	public void setup(){
		
		intilization();
		obj=new login();
		ad=obj.loginOrange(prop.getProperty("username"), prop.getProperty("password"));
		
	
	}
	
	@Test(priority=1, description="verify adminlink")
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case des:verify test case")
	@Story("storyname: To check adminlink")
	public void adminklinktest(){
		 ad=new admin();
		ad.Adlinkisavilable();
		 
		
	}
	
	@Test(priority=2)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case des:verify pmlink case")
	@Story("storyname: To check pmlink")
	public void pmlinkisavilable(){
		ad.Pimlinkisavailable();
		
	}	
		
	
	@Test(priority=3)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case des:to checkrecuitlink")
	@Story("storyname: To check reculink")
	public void reculink(){
		ad.recisavilable();
		
	}
	
	@Test(priority=4)
	@Severity(SeverityLevel.NORMAL)
	@Description("Test case des:verify logout case")
	@Story("storyname: To check logout")
	public void welcom(){
		ad.Logout();
		
	}
	

	
	
	@AfterMethod
	public void closeapp(){
		driver.close();
	}
	
	}



