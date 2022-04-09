package com.leaftaps.ui.test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leaftaps.ui.pages.Loginpage;

import base.ProjectSpecificMethod;

public class TC001_CreateLead extends ProjectSpecificMethod {
	
	@BeforeTest
	public void setData(){
		excelFilePath="./testData/tc001.xlsx";
	}
	
	@Test (priority =0 , dataProvider = "TC001")
	
	public void TC001CreateLead(String username,String password,String companyName,String firstName,String LastName) {
		
		new Loginpage(driver)
		.enterusername(username)
		.enterpassword(password)
		.clickLoginButton_Positive()
		.ClickCRMSFA()
		.ClickLeadTab()
		.ClickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(LastName)
		.ClickCreateLeadButton()
		.VerifyLeadID();



}
}