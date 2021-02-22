package com.pageclass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parentclass.Apputils;

public class adminlink extends Apputils{
	@FindBy(xpath="//*[@id='systemUser-information']/a")WebElement ele;
	
	public adminlink(){
		PageFactory.initElements(driver, this);
		
	}
	
	public void adminlinkdispayed(){
	boolean flag=ele.isDisplayed();
	}

}
