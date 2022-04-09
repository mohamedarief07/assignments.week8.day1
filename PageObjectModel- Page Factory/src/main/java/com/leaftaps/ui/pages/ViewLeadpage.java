package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class ViewLeadpage extends ProjectSpecificMethod{
	
	public ViewLeadpage(RemoteWebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//@FindBy for the page
	@FindBy(xpath="//span[@id='viewLead_companyName_sp']") WebElement ele_VerifyLeadID;
	@FindBy(linkText="Edit") WebElement ele_ClickEditButton;
	@FindBy(linkText="Duplicate Lead") WebElement ele_ClickDuplicateButton;
	@FindBy(linkText="Delete") WebElement ele_ClickDeleteButton;
	@FindBy(linkText="Find Leads") WebElement ele_ViewLead_ClickFindLead;
	
	public ViewLeadpage VerifyLeadID()
	{
		String text = ele_VerifyLeadID.getText();
		System.out.println(text);
		return this;
	}
	
	public EditLeadpage ClickEditButton()
	{
		ele_ClickEditButton.click();
	
		return new EditLeadpage(driver);
	}
	
	public DuplicatePage ClickDuplicateButton()
	{
		ele_ClickDuplicateButton.click();
	
		return new DuplicatePage(driver);
	}
	
	public MyLeadpage ClickDeleteButton()
	{
		driver.findElement(By.linkText("Delete")).click();
	
		return new MyLeadpage(driver);
	}
	
	
	public FindLeadspage ClickFindLead()
	{
		ele_ViewLead_ClickFindLead.click();
		return new FindLeadspage(driver);

	}

}
