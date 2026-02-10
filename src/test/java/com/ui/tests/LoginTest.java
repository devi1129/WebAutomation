package com.ui.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.pages.HomePage;

public class LoginTest {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		HomePage homePage = new HomePage(driver);

		String actualUsername = homePage.goToLoginPage().doLoginWith("devi29@yopmail.com", "bharat@27").getUserName();

		System.out.println(actualUsername);

	}

}
