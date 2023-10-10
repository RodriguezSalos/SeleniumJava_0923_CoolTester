package com.orange;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.AdminPage;
import poc.DashboardPage;
import poc.LoginPage;

public class LoginTest {
	WebDriver driver;
	Base base;
	LoginPage loginPage;
	DashboardPage dashboardPage;
	AdminPage adminPage;
	String username, password;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.driverConnection("Chrome");
		loginPage = new LoginPage(driver);
		dashboardPage = new DashboardPage(driver);
		adminPage = new AdminPage(driver);

		// Set values
		this.username = base.getJSONValue("LoginData", "admin", "username");
		this.password = base.getJSONValue("LoginData", "admin", "password");
		loginPage.loginOrange(username, password);
	}

	@Test
	public void TC001() {

		Assert.assertTrue(dashboardPage.validationUserIsLogged());
		dashboardPage.clickAdmin();
		Assert.assertTrue(adminPage.verifySearchButton());
	}

	@AfterTest
	public void afterTest() {
		base.driverClose();
	}

}
