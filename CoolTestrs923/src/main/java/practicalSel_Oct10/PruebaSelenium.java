package practicalSel_Oct10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class PruebaSelenium {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Test Chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		WebElement userNameTxt = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.id("password"));
		WebElement loginBtn = driver.findElement(By.xpath("//input[@data-test = 'login-button']"));
		WebElement txtSwagLabs = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		//Login
		userNameTxt.sendKeys("standard_user");
		Thread.sleep(1000);
		passwordTxt.sendKeys("secret_sauce");
		Thread.sleep(1000);
		loginBtn.click();
		Thread.sleep(500);

		//Methods on the browser
		//Obtain title of the webpage
		String title = driver.getTitle();
		System.out.println("The title is: " + title);
		
		//obtain URL
		String url = driver.getCurrentUrl();
		System.out.println("The URL is: " + url);
		Thread.sleep(2000);
		
		//back , forward & refresh in the webdriver
		/*
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		
		//Verify element is displayed
		boolean prodContainer = driver.findElement(By.className("inventory_item_name")).isDisplayed();
		if(prodContainer)
			System.out.println("The item is displayed");
		Thread.sleep(2000);
		//Obtain text
		String prodName = driver.findElement(By.className("inventory_item_name")).getText();
		System.out.println("The text of the product: " + prodName);
		Thread.sleep(1000);
		*/
		
		//Drodown static
		//driver.manage().window().maximize();
		//Thread.sleep(2000);
		Select ddProdSelect = new Select(driver.findElement(By.className("product_sort_container")));
		ddProdSelect.selectByValue("lohi");
		By ddlCurrency = By.className("product_sort_container");
		ddlCurrency.selectByValue("lohi");
		//ddlCurrency.selectByVisibleText(lohi);
		System.out.println(option + ": " + ddlCurrency.getFirstSelectedOption().getText());
		
		
		System.out.println("ddProdSelect getoptions: " + ddProdSelect.getWrappedElement());
		Thread.sleep(1000);
		//System.out.println("getting text: " + ddProdSelect.getText());
		
		//Close browser
		//close() --> close the CURRENT window/tab that the webdriver is using.
		//quit() --> close ALL windows/tabs that the webdriver is using.
		
		//driver.close();
		driver.quit();
	}

}
