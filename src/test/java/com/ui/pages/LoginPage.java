package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.utility.BrowserUtility;

public class LoginPage extends BrowserUtility {

	private static final By emailTextBoxLocator = By.id("email");

	private static final By passwordTextBoxLocator = By.id("passwd");

	private static final By loginButton = By.id("SubmitLogin");

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	public MyAccountPage doLoginWith(String username, String password) {
		enterText(emailTextBoxLocator, username);
		enterText(passwordTextBoxLocator, password);

		clickon(loginButton);

		MyAccountPage myAccountPage = new MyAccountPage(getDriver());

		return myAccountPage;

	}
}
