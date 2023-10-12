package poc;

import java.io.PrintStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import base.GlobalVariables;

public class DropdownsPractise extends Base {
	public DropdownsPractise(WebDriver driver) {
		super(driver);
	}

	public void launchPage() {
		launchBrowser(GlobalVariables.PRACTICE_URL);
		hardWait(5000);
		// implicitWait(20);
		/*
		 * String expectedUrl = "https://rahulshettyacademy.com/dropdownsPractise/";
		 * String actualUrl = driver.getCurrentUrl(); System.out.println("actualUrl: " +
		 * actualUrl); Assert.assertEquals(actualUrl, expectedUrl,
		 * "Actual page url is not the same as expected");
		 */
	}

	// Objects
	// Static dropdown
	By ddlCurrency = By.xpath("//select[contains(@name,'ListCurrency')]");

	// Custom Methods
	public boolean verifyddlCurrency() {
		hardWait(5000);
		System.out.println("verifyddlCurrency end");
		return objIsDisplayed(ddlCurrency);
	}

	public void clickDropdownStatic(int index) {
		System.out.println("Start.-clickDropdownStatic - Select by index");
		Select dd = new Select(driver.findElement(ddlCurrency));
		int ddSize = dd.getOptions().size();
		hardWait(5000);
		System.out.println("Dropdown values: ");
		for(int i = 1; i < ddSize; ++i) {
			dd.selectByIndex(i);
			System.out.println(i + ": " + dd.getFirstSelectedOption().getText());
		}
		System.out.println("ddCounter" + (ddSize-1));
		dd.selectByIndex(index);
		System.out.println(index + ": " + dd.getFirstSelectedOption().getText());
		hardWait(5000);
		System.out.println("End.-clickDropdownStatic");
	}
	
	public void clickDropdownStatic(String option) {
		/*
		 * This method is when the dropdown has 'select' tag from the dome.
		 * To locate by value we can search through 'dd.selectByValue(option)'
		 */
		
		System.out.println("Start.-clickDropdownStatic-select by option");
		Select dd = new Select(driver.findElement(ddlCurrency));
		int ddSize = dd.getOptions().size();
		hardWait(5000);
		System.out.println("Dropdown values: ");
		for(int i = 1; i < ddSize; ++i) {
			dd.selectByIndex(i);
			System.out.println(i + ": " + dd.getFirstSelectedOption().getText());
		}
		System.out.println("ddCounter" + (ddSize-1));
		dd.selectByVisibleText(option);
		System.out.println(option + ": " + dd.getFirstSelectedOption().getText());
		hardWait(5000);
		System.out.println("End.-clickDropdownStatic");
	}





}
