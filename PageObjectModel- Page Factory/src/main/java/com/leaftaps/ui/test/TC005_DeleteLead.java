package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.Loginpage;

import base.ProjectSpecificMethod;

public class TC005_DeleteLead extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		
		excelFilePath="./testData/tc005.xlsx";
	}
	
	@Test ( dataProvider="TC005")
	public void TC005_DeleteLeads (String username, String password,String firstname, String lastname) throws InterruptedException {
		
		new Loginpage(driver)
		.enterusername(username)
		.enterpassword(password)
		.clickLoginButton_Positive()
		.ClickCRMSFA()
		.ClickLeadTab()
		.ClickFindLead()
		.EnterFirstName(firstname)
		.EnterLastName(lastname)
		.ClickFindLeadsButton()
		.ClickFirstLeadID()
		.ClickDeleteButton()
		.ClickFindLead()
		.EnterFirstName(firstname)
		.EnterLastName(lastname)
		.ClickFindLeadsButton()
		.VerifyRecordsNotFound();		
		
		
	}
	
}

