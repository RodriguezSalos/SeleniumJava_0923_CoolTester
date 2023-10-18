package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class AdminPage extends Base{
	public AdminPage(WebDriver driver) {
		super(driver);
	}
	//Objects
	By btnSearch = By.xpath("//button[@type='submit']");
	
	//Custom Methods
	public boolean verifySearchButton(){
		explicitWait(btnSearch,5);
		return objIsDisplayed(btnSearch);
	}
}
