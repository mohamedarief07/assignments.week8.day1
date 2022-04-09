package com.leaftaps.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.ProjectSpecificMethod;

public class Loginpage extends ProjectSpecificMethod {

	public Loginpage(RemoteWebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//@FindBy for the page
@FindBy(id="username") WebElement ele_username;
@FindBy(id="password") WebElement ele_password;
@FindBy(xpath = "//input[@type='submit']") WebElement ele_LoginButton;


	public Loginpage enterusername(String username) {
		ele_username.sendKeys(username);
		return this;

	}


	public Loginpage enterpassword(String password) {
		ele_password.sendKeys(password);
		return this;

	}

	public Welcomepage clickLoginButton_Positive() {
		ele_LoginButton.click();
		return new Welcomepage(driver);

	}

	public Loginpage clikcLoginButton_Negative() {
		ele_LoginButton.click();
		return this;

	}

}
