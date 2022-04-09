package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class Welcomepage extends ProjectSpecificMethod{
	
	public Welcomepage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(linkText="CRM/SFA") WebElement ele_CRMSFA;
	public Homepage ClickCRMSFA()
	{
		ele_CRMSFA.click();
		return new Homepage(driver);
	}

}
