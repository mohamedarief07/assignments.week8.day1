package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class MyLeadpage extends ProjectSpecificMethod{
	
	public MyLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(linkText="Find Leads") WebElement ele_MyLead_ClickFindLead;

	public FindLeadspage ClickFindLead()
	{
		ele_MyLead_ClickFindLead.click();
		return new FindLeadspage(driver);

	}
}
