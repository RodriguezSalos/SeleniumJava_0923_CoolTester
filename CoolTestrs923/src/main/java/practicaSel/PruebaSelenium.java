package practicaSel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class PruebaSelenium {

	public static void main(String[] args) {
		
		System.out.println("Test Chrome");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		sleep(3000);
		driver.quit();
		System.out.println("Test finshed Chrome");
		
		System.out.println("Test FireFox");
		WebDriver driverFF = new FirefoxDriver();
		driverFF.get("https://www.google.com");
		sleep(3000);
		driverFF.quit();
		System.out.println("Test finished FireFox");

		System.out.println("Test Edge");
		WebDriver driverEdge = new EdgeDriver();
		driverEdge.get("https://www.google.com");
		sleep(3000);
		driverEdge.quit();
		System.out.println("Test finished Edge");
		
		System.out.println("Test Safari");
		//https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-safari-driver/3.141.59
		WebDriver driverSafari = new SafariDriver();
		driverSafari.get("https://google.com");
		sleep(3000);
		//driverSafari.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		//driverSafari.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driverSafari.quit();
		//driverSafari.close();
		System.out.println("Test finished Safari");
		
		
		
	}

	// HARD WAIT JAVA
			private static void sleep(long m) {
				System.out.println("Hard Time");
				try {
					Thread.sleep(m);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

}
