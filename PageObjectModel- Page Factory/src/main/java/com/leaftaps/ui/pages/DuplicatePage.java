package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class DuplicatePage extends ProjectSpecificMethod{
	
	public DuplicatePage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(xpath ="(//input[@name='companyName'])[2]") WebElement ele_Dupcompanyname;	
	@FindBy(xpath ="//input[@type='submit']") WebElement ele_Dup_CreateLeadButton;
	
	public DuplicatePage DuplicateCompanyName(String companyname)
	{
		ele_Dupcompanyname.clear();
		ele_Dupcompanyname.sendKeys(companyname);
		return this;
	}
	public ViewLeadpage Dup_ClickCreateLeadButton()
	{
		ele_Dup_CreateLeadButton.click();
		return new ViewLeadpage(driver);
	}



}
