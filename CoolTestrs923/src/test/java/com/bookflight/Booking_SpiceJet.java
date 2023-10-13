package com.bookflight;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.Base;
import poc.DropdownsPractise;
import poc.HomePage_Spacejet;

public class Booking_SpiceJet {
	WebDriver driver;
	Base base;
	HomePage_Spacejet homepage_spacejet;
	
  @BeforeTest
  public void beforeTest() {
		base = new Base(driver);
		driver = base.driverConnection("Chrome");
		homepage_spacejet = new  HomePage_Spacejet(driver);
		homepage_spacejet.launchPage();
  }
  
  
  @Test
  public void DD002() {
	  homepage_spacejet.destinations("KQH", "ATQ");
  }
  
  @AfterTest
  public void afterTest() {
	  base.driverClose();
  }

}
