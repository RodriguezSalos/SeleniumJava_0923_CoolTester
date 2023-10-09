package base;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.util.Timeout;

public class Base {

	private WebDriver driver;
	/*
	 * Constructor
	 */

	public Base(WebDriver driver) {
		this.driver = driver;
	}

	/*
	 * Driver connection
	 */

	public WebDriver driverConnection(String platform) {
		switch (platform) {
		case "Chrome":
			System.out.println("Test Chrome");
			ChromeOptions chromeOpt = new ChromeOptions();
			driver = new ChromeDriver(chromeOpt);
			break;
		case "Firefox":
			System.out.println("Test FireFox");
			//FirefoxDriver driverFF = new FirefoxDriver();
			driver = new FirefoxDriver();
			break;

		case "Edge":
			System.out.println("Test Edge");
			//EdgeDriver driverE = new EdgeDriver();
			driver = new EdgeDriver();
			break;
		}
		return driver;
	}

	public WebDriver driverConnection() {
		System.out.println("Test Chrome");
		ChromeOptions chromeOpt = new ChromeOptions();
		driver = new ChromeDriver(chromeOpt);

		return driver;
	}

	// HEADER
	/*
	 * @author rodriguez.salos@gmail.com
	 * 
	 * @throws IO Exception
	 * 
	 * @date October 6th '23
	 * 
	 * @update: new
	 */
	public void launchBrowser(String url) {
		try {
			driver.get(url);
			driver.manage().window().maximize();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void hardWait(int milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void implicitWait(Duration timeout) {
		// driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}

	public void explicitWait(By obj, Duration i) {
		WebDriverWait wait = new WebDriverWait(driver, i);
		wait.until(ExpectedConditions.visibilityOfElementLocated(obj));
	}

	// Enter Text
	public void type(By obj, String inputText) {
		try {
			driver.findElement(obj).sendKeys(inputText);
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public void click(By obj) {
		try {
			driver.findElement(obj).click();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
		}
	}

	public boolean objIsDisplayed(By obj) {
		try {
			return driver.findElement(obj).isDisplayed();
		} catch (NoSuchElementException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void driverClose() {
		driver.close();
		// driver.quit();
	}

}
