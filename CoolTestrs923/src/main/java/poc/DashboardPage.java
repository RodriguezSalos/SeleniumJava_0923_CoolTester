package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;

public class DashboardPage extends Base{
	public DashboardPage(WebDriver driver) {
		super(driver);
	}

	//Objects
	By btnAvatar = By.xpath("//span[@class = 'oxd-userdropdown-tab']");
	By btnAdmin = By.xpath("//span[text() = 'Admin']");
	By btnDashboard = By.xpath("//span[text() = 'Dashboard']");
	//By btnLeave = By.xpath("//span[@class = 'oxd-userdropdown-tab']");
	
	//Custom Methods
	public boolean validationUserIsLogged() {
		return objIsDisplayed(btnAvatar);
	}
	
	public void clickAdmin() {
		implicitWait(5);
		click(btnAdmin);
	}
	
	public void clickDashboard() {
		implicitWait(5);
		click(btnDashboard);
	}
}
