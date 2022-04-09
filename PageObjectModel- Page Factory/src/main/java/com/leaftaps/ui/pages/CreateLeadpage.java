package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class CreateLeadpage extends ProjectSpecificMethod{
	
	public CreateLeadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(id="createLeadForm_companyName") WebElement ele_companyname;
	@FindBy(id="createLeadForm_firstName") WebElement ele_firstname;
	@FindBy(id="createLeadForm_lastName") WebElement ele_lastname;
	@FindBy(name="submitButton") WebElement ele_CreateLeadButton;
	
	public CreateLeadpage enterCompanyName(String companyname)
	{
		ele_companyname.sendKeys(companyname);
		return this;
	}
	public CreateLeadpage enterFirstName(String firstname)
	{
		ele_firstname.sendKeys(firstname);
		return this;
	}

	public CreateLeadpage enterLastName(String lastname)
	{
		ele_lastname.sendKeys(lastname);
		return this;
	}

	public ViewLeadpage ClickCreateLeadButton()
	
	{
		ele_CreateLeadButton.click();
		return new ViewLeadpage(driver);
	}


}
