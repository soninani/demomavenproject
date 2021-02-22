package com.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.testpack.adminlinktest;

import parentclass.Apputils;

public class admin extends Apputils{
	
	@FindBy(linkText="Admin")WebElement link;
	@FindBy(linkText="PIM")WebElement linkpm;
	@FindBy(linkText="Recruitment")WebElement Rc;
	@FindBy(linkText="Welcome Suresh")WebElement welcome;
	@FindBy(linkText="Logout")WebElement log;
	
	
	public admin(){
		PageFactory.initElements(driver, this);
	}
	
	public adminlink Adlinkisavilable(){
		  link.click();
		  return  new adminlink();
		
	}
	public page Pimlinkisavailable(){
	    linkpm.click();
		return new page();

	}
	public Recuirtmentpage recisavilable(){
	    Rc.click();
		return new Recuirtmentpage();
}
	public login Logout(){
	    welcome.click();
	    log.click();
		return new login();
	
}
	
}
