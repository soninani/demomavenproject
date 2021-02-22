package com.pageclass;

import javax.swing.Action;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import parentclass.Apputils;

public class page extends Apputils{
	@FindBy(linkText="PIM")
	@CacheLookup
	WebElement Pim;
	
	@FindBy(id="menu_pim_viewEmployeeList")WebElement emplist;
	@FindBy(name="btnAdd")WebElement Addbuton;
	
	@FindBy(name="firstName")WebElement frstname;
	@FindBy(name="lastName")WebElement lstname;
	@FindBy(name="chkLogin")WebElement ticklogin;
	@FindBy(xpath="//*[@id='btnSave']")WebElement savebuton;
	
	
	public page(){
		PageFactory.initElements(driver, this);
	}

	public void clickonpimlink(){
		Pim.click();
		emplist.click();
		
		
	}
	public Employeelist Addemployee(String fstname,String lastname){
		
		Addbuton.click();
	    frstname.sendKeys(fstname);
		lstname.sendKeys(lastname);
		ticklogin.click();
		savebuton.click();
		return new Employeelist();
		
	}
}