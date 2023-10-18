package com.bookflight;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.DropdownsPractise;

public class BookFlight {
	WebDriver driver;
	Base base;
	DropdownsPractise dropdownpractise;

	@BeforeTest
	public void beforeTest() {
		base = new Base(driver);
		driver = base.driverConnection("Chrome");
		dropdownpractise = new  DropdownsPractise(driver);
		dropdownpractise.launchPage();
	}

	@Test
	public void dd01() {
		dropdownpractise.verifyddlCurrency();

	}
	@Test
	public void dd02() {
		dropdownpractise.clickDropdownStatic(2);
	}
	@Test
	public void dd03() {
		dropdownpractise.clickDropdownStatic("USD");
	}
	@Test
	public void dd04() {
		dropdownpractise.ddlPassengers(2,2,2);
	}

	@AfterTest
	public void afterTest() {
		base.driverClose();
	}

}
