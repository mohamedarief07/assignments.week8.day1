package com.leaftaps.ui.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class MergeLeadPage extends ProjectSpecificMethod{
	
	public MergeLeadPage(RemoteWebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	//@FindBy for the page
	@FindBy(xpath="//img[@alt='Lookup']") WebElement ele_ClickFromLeadLookup;
	@FindBy(xpath="(//img[@alt='Lookup'])[2]") WebElement ele_ClickToLeadLookup;
	@FindBy(xpath="//a[text()='Merge']") WebElement ele_ClickMergeButton;

	
	public MergeLeadPage ClickFromLeadLookup()
	{
		ele_ClickFromLeadLookup.click();
		return this;
	}
	
	
	public MergeLeadPage ClickToLeadLookup()
	{
		ele_ClickToLeadLookup.click();
		return this;
	}
	
	public FindLeadsPopupPage getWindowHandlesToNewScreen()
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsPopupPage(driver);
	}
	
	public MergeLeadPage getWindowHandlesToOldScreen()
	{
		Set<String> allWindows = driver.getWindowHandles();
		List<String> allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(0));
		return this;
	}

	public MergeLeadPage ClickMergeButton()
	{
		ele_ClickMergeButton.click();
		return this;
	}
	
	public ViewLeadpage ManageAlert()
	{
		driver.switchTo().alert().accept();
		return new ViewLeadpage(driver);
	}



}
