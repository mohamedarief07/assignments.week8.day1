package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class Homepage extends ProjectSpecificMethod{
	
	public Homepage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy for the page
	@FindBy(linkText="Leads") WebElement ele_LeadsTab;
	public Leadpage ClickLeadTab()
	{
		ele_LeadsTab.click();
		return new Leadpage(driver);
	}

}
