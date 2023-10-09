package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.Base;
import base.GlobalVariables;

public class LoginPage extends Base {
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	//Objects
	By txtUsername = By.xpath("//input[@name='username']");
	By txtPassword = By.xpath("//input[@type='password']");
	By btnLogin = By.xpath("//button[@type='submit']");

	//Custom methods
	public void loginOrange(String username, String password) {
		launchBrowser(GlobalVariables.QA_URL);
		hardWait(5000);
		//implicitWait(20);
		type(txtUsername, username);
		type(txtPassword, password);
		//explicitWait(btnLogin,10);
		hardWait(5000);
		click(btnLogin);
		hardWait(10000);
	}


}
