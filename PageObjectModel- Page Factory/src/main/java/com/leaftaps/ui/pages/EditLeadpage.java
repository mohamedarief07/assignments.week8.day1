package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class EditLeadpage extends ProjectSpecificMethod{
	
	public EditLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy for the page
	@FindBy(id="updateLeadForm_companyName") WebElement ele_UpdateCompanyName;
	@FindBy(name="submitButton") WebElement ele_UpdateButton;
	
	public EditLeadpage UpdateCompanyName(String companyname)
	{
		ele_UpdateCompanyName.clear();
		ele_UpdateCompanyName.sendKeys(companyname);
		return this;
	}
	public ViewLeadpage ClickUpdateButton()
	{
		ele_UpdateButton.click();
		return new ViewLeadpage(driver);
			
	}
	
}
