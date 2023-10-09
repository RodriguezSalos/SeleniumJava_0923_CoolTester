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
		hardWait(5000);
		click(btnAdmin);
	}
	
	public void clickDashboard() {
		hardWait(5000);
		click(btnDashboard);
	}
}
