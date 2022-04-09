package com.leaftaps.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class Leadpage extends ProjectSpecificMethod{
	
	public Leadpage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//@FindBy for the page
	@FindBy(linkText="Create Lead") WebElement ele_CreateLeadLink;
	@FindBy(linkText="Find Leads") WebElement ele_FindLeadLink;
	@FindBy(linkText="Merge Leads") WebElement ele_MergeLeadLink;
	
	public CreateLeadpage ClickCreateLead()
	{
		ele_CreateLeadLink.click();
		return new CreateLeadpage(driver);
	}
	public FindLeadspage ClickFindLead()
	{
		ele_FindLeadLink.click();
		return new FindLeadspage(driver);
	}
	public MergeLeadPage ClickMergeLead()
	{
		ele_MergeLeadLink.click();
		return new MergeLeadPage(driver);
	}
}
