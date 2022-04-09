package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.Loginpage;

import base.ProjectSpecificMethod;

public class TC002_EditLead extends ProjectSpecificMethod {
	@BeforeTest
	public void setData() {
		excelFilePath="./testData/tc002.xlsx";

	}

	@Test (dataProvider="TC002")

	public void TC002_EditLeads(String username,String password ,String phoneNumber,String companyname) throws InterruptedException {

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
		.ClickEditButton()
		.UpdateCompanyName(companyname)
		.ClickUpdateButton()
		.VerifyLeadID();


	}


}