package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.Loginpage;

import base.ProjectSpecificMethod;

public class TC004_MergeLead extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
	
		excelFilePath="./testData/tc004.xlsx";
	}
	
	@Test (dataProvider = "TC004")
		
	
	public void TC004_MergeLeads(String username,String password,String firstname_from, String firstname_to) throws InterruptedException {
		
		//Login page
		new Loginpage(driver)
		.enterusername(username)
		.enterpassword(password)
		.clickLoginButton_Positive()
		
		//Welcome page
		.ClickCRMSFA()
		
		//Home page
		.ClickLeadTab()
		
		//Lead page
		.ClickMergeLead()
		
		//Merge page
		.ClickFromLeadLookup()
		.getWindowHandlesToNewScreen()
		
		//Find pop up page
		.EnterFirstName_From(firstname_from)
		.ClickFindLeadsButton()
		.ClickFirstLeadID()
		.getWindowHandlesToOldScreen()
		
		//Merge page
		.ClickToLeadLookup()		
		.getWindowHandlesToNewScreen()
		
		//Find pop up page
		.EnterFirstName_TO(firstname_to)
		.ClickFindLeadsButton()
		.ClickFirstLeadID()
		.getWindowHandlesToOldScreen()
		
		//Merge page
		.ClickMergeButton()
		.ManageAlert()
		
		//Lead page
		.ClickFindLead()
		.EnterFirstName(firstname_from)
		.ClickFindLeadsButton()
		.VerifyRecordsNotFound();
	
		
	}
}
