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
		driver = base.driverConnection("Safari");
		dropdownpractise = new  DropdownsPractise(driver);
		dropdownpractise.launchPage();
	}

	@Test
	public void dd01() {
		//dropdownpractise.verifyddlCurrency();
		//dropdownpractise.clickDropdownStatic(2);
		//dropdownpractise.clickDropdownStatic("USD");
		dropdownpractise.ddlPassengers(2,2,2);
	}

	@AfterTest
	public void afterTest() {
		base.driverClose();
	}

}
