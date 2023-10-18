package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import base.GlobalVariables;

public class DropdownsPractise extends Base {
	public DropdownsPractise(WebDriver driver) {
		super(driver);
	}

	public void launchPage() {
		launchBrowser(GlobalVariables.PRACTICE_URL);
		implicitWait(5);
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
	By ddlPassengers = By.xpath("//div[@id='divpaxinfo']");
	By ddlPsngrsAdltsIncrease = By.xpath("//span[@id='hrefIncAdt']");
	By ddlPsngrsChildIncrease = By.xpath("//span[@id='hrefIncChd']");
	By ddlPsngrsInfantIncrease = By.xpath("//span[@id='hrefIncInf']");
	By ddlDone = By.xpath("//input[@value='Done']");

	// Custom Methods
	public boolean verifyddlCurrency() {
		explicitWait(ddlCurrency,5);
		System.out.println("verifyddlCurrency end");
		return objIsDisplayed(ddlCurrency);
	}

	public void clickDropdownStatic(int index) {
		System.out.println("Start.-clickDropdownStatic - Select by index");
		Select dd = new Select(driver.findElement(ddlCurrency));
		int ddSize = dd.getOptions().size();
		explicitWait(ddlCurrency,5);
		System.out.println("Dropdown values: ");
		for(int i = 1; i < ddSize; ++i) {
			dd.selectByIndex(i);
			System.out.println(i + ": " + dd.getFirstSelectedOption().getText());
		}
		System.out.println("ddCounter" + (ddSize-1));
		dd.selectByIndex(index);
		System.out.println(index + ": " + dd.getFirstSelectedOption().getText());
		implicitWait(5);
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
		implicitWait(5);
		System.out.println("Dropdown values: ");
		for(int i = 1; i < ddSize; ++i) {
			dd.selectByIndex(i);
			System.out.println(i + ": " + dd.getFirstSelectedOption().getText());
		}
		System.out.println("ddCounter" + (ddSize-1));
		dd.selectByVisibleText(option);
		System.out.println(option + ": " + dd.getFirstSelectedOption().getText());
		implicitWait(5);
		System.out.println("End.-clickDropdownStatic");
	}

	public void ddlPassengers(int adults) {
		/*
		 * This method is when the dropdown has 'div' tag instance of 'select' tag from the dome.
		 * 
		 */
		
		System.out.println("Start.-clickDropdown Passengers- DIV tag - adult");
		explicitWait(ddlPassengers,5);
		driver.findElement(ddlPassengers).click();
		
		
		for(int i = adults; i <= adults; ++i) {
			driver.findElement(ddlPsngrsAdltsIncrease).click();
		}
		explicitWait(ddlDone,5);
		driver.findElement(ddlDone).click();
		System.out.println(driver.findElement(ddlPassengers).getText());
		implicitWait(5);
		System.out.println("End.-clickDropdown Passengers- DIV tag");
		implicitWait(5);
	}
	
	public void ddlPassengers(int adults, int child) {
		/*
		 * This method is when the dropdown has 'div' tag instance of 'select' tag from the dome.
		 * 
		 */
		
		System.out.println("Start.-clickDropdown Passengers- DIV tag adult + child");
		explicitWait(ddlPassengers,5);
		driver.findElement(ddlPassengers).click();
		implicitWait(5);
		
		for(int i = adults; i <= (adults); ++i) {
			driver.findElement(ddlPsngrsAdltsIncrease).click();
		}
		explicitWait(ddlPsngrsChildIncrease,5);
		for(int i = child; i <= (child+1); ++i) {
			driver.findElement(ddlPsngrsChildIncrease).click();
		}
		explicitWait(ddlDone,5);
		driver.findElement(ddlDone).click();
		System.out.println(driver.findElement(ddlPassengers).getText());
		implicitWait(5);
		System.out.println("End.-clickDropdown Passengers- DIV tag");
		implicitWait(5);
	}
	
	public void ddlPassengers(int adults, int child, int infant) {
		/*
		 * This method is when the dropdown has 'div' tag instance of 'select' tag from the dome.
		 * 
		 */
		
		System.out.println("Start.-clickDropdown Passengers- DIV tag adult + child + infant");
		explicitWait(ddlPassengers,5);
		driver.findElement(ddlPassengers).click();
		implicitWait(5);
		
		for(int i = adults; i <= (adults); ++i) {
			driver.findElement(ddlPsngrsAdltsIncrease).click();
		}
		explicitWait(ddlPsngrsChildIncrease,5);
		for(int i = child; i <= (child+1); ++i) {
			driver.findElement(ddlPsngrsChildIncrease).click();
		}
		explicitWait(ddlPsngrsInfantIncrease,5);
		for(int i = infant; i <= (infant+1); ++i) {
			driver.findElement(ddlPsngrsInfantIncrease).click();
		}
		implicitWait(5);
		driver.findElement(ddlDone).click();
		System.out.println(driver.findElement(ddlPassengers).getText());
		implicitWait(5);
		System.out.println("End.-clickDropdown Passengers- DIV tag");
		implicitWait(3);
	}



}
