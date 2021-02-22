package com.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import parentclass.Apputils;

public class login extends Apputils {
	@FindBy(name="txtUsername")WebElement username;
	@FindBy(name="txtPassword")WebElement password;
	@FindBy(name="Submit")WebElement login;

	@FindBy(xpath="//*[@id='divLogo']/img")WebElement image;
	
public login(){
	PageFactory.initElements(driver, this);
}

public admin loginOrange(String uname,String pwrd){
	username.sendKeys(uname);
	password.sendKeys(pwrd);
	login.click();
	return new admin();
	
	
	}
public boolean validateHrmimage(){
	
	return image.isDisplayed();
	
	
}
}



