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
		hardWait(5000);
		return objIsDisplayed(btnSearch);
	}
}
