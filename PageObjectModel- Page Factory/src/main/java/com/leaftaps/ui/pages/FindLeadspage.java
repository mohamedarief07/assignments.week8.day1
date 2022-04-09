package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class FindLeadspage extends ProjectSpecificMethod{
	
	public FindLeadspage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(xpath ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement ele_GetTextleadID;
	@FindBy(xpath ="(//input[@name='firstName'])[3]") WebElement ele_EnterFirstName;
	@FindBy(xpath ="(//input[@name='lastName'])[3]") WebElement ele_EnterLastName;
	@FindBy(xpath ="//span[text()='Phone']") WebElement ele_PhoneTab;
	@FindBy(xpath ="//input[@name='phoneNumber']") WebElement ele_phoneNumber;
	@FindBy(xpath ="//button[text()='Find Leads']") WebElement ele_FindLeadButton;
	@FindBy(xpath ="//div[@class='x-paging-info']") WebElement ele_VerifyRecordsNotFound;
	@FindBy(xpath ="//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a") WebElement ele_FirstLeadID;
	
	public  FindLeadspage GetTextleadID()
	{
		WebElement LeadID = ele_GetTextleadID;
	
		return this;
	}
		
		

	public FindLeadspage EnterFirstName(String firstname)
	{
		ele_EnterFirstName.sendKeys(firstname);
		return this;
	}
	
	
	public FindLeadspage EnterLastName(String lastName)
	{
		ele_EnterLastName.sendKeys(lastName);
		return this;
	}
	
	public FindLeadspage ClickPhoneTab()
	{
		ele_PhoneTab.click();
		return this;
	}
	
	public FindLeadspage EnterphNumber(String phoneNumber)
	{
		ele_phoneNumber.sendKeys(phoneNumber);
		return this;
	}
	

	
	public FindLeadspage ClickFindLeadsButton()
	{
		ele_FindLeadButton.click();
		return this;
	}
	
	
	public FindLeadspage VerifyRecordsNotFound()
	{
		String text = ele_VerifyRecordsNotFound.getText();
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
		return this;
	}
	
	public ViewLeadpage ClickFirstLeadID() throws InterruptedException
	{
		Thread.sleep(2000);
		ele_FirstLeadID.click();
		return new ViewLeadpage(driver);
	}
	
	
}
