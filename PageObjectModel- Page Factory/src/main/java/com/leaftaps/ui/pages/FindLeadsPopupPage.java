package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class FindLeadsPopupPage extends ProjectSpecificMethod{
	
	public FindLeadsPopupPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(xpath ="(//input[@name='firstName'])") WebElement ele_EnterFirstName_From;
	@FindBy(xpath ="(//input[@name='firstName'])") WebElement ele_EnterFirstName_TO;
	@FindBy(xpath ="//span[text()='Phone']") WebElement ele_ClickPhoneTabPOP;
	@FindBy(xpath ="//input[@name='phoneNumber']") WebElement ele_EnterphNumberPOP;
	@FindBy(xpath ="//button[text()='Find Leads']") WebElement ele_FindLeadsButtonPOP;
	@FindBy(xpath ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement ele_FirstLeadIDClickPOP;
	
	
	public FindLeadsPopupPage EnterFirstName_From(String firstname_from)
	{
		ele_EnterFirstName_From.sendKeys(firstname_from);
		return this;
	}
	
	public FindLeadsPopupPage EnterFirstName_TO(String firstname_to)
	{
		ele_EnterFirstName_TO.sendKeys(firstname_to);
		return this;
	}
	public FindLeadsPopupPage ClickPhoneTab()
	{
		ele_ClickPhoneTabPOP.click();
		return this;
	}
	
	public FindLeadsPopupPage EnterphNumber(String phoneNumber)
	{
		ele_EnterphNumberPOP.sendKeys(phoneNumber);
		return this;
	}
	

	public FindLeadsPopupPage ClickFindLeadsButton()
	{
		ele_FindLeadsButtonPOP.click();
		return this;
	}
	
	
	
	public MergeLeadPage ClickFirstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_FirstLeadIDClickPOP.click();
		return new MergeLeadPage(driver);
	}
	
	
}
