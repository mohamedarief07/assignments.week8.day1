package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.Loginpage;

import base.ProjectSpecificMethod;

public class TC003_DuplicateLead extends ProjectSpecificMethod{

	@BeforeTest
	public void setData() {
		excelFilePath="./testData/tc003.xlsx";	
	}

	@Test (dataProvider="TC003")
	public void TC003_DuplicateLeads(String username,String password ,String phoneNumber,String companyname) throws InterruptedException {

		new Loginpage(driver)
		.enterusername(username)
		.enterpassword(password)
		.clickLoginButton_Positive()
		.ClickCRMSFA()
		.ClickLeadTab()
		.ClickFindLead()
		.ClickPhoneTab()
		.EnterphNumber(phoneNumber)
		.ClickFindLeadsButton()
		.ClickFirstLeadID()
		.ClickDuplicateButton()
		.DuplicateCompanyName(companyname)
		.Dup_ClickCreateLeadButton()
		.VerifyLeadID();

	}
}
