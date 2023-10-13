package poc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import base.Base;
import base.GlobalVariables;
public class HomePage_Spacejet extends Base{
	public HomePage_Spacejet(WebDriver driver) {
		super(driver);
	}

	public void launchPage() {
		launchBrowser(GlobalVariables.SPACEJET);
		hardWait(5000);
	}
	// Objects
	// Dynamic dropdown
	By ddFrom = By.xpath("//div[text()='From']");
	By ddTo = By.xpath("//div[contains(@data-testid,'destination')]");

	

	//Custom Methods
	public void destinations(String fromDestination, String toDestination) {
		//destinations
		By ddFromDstn = By.xpath("//div[contains(text(),'" + fromDestination + "')]");
		By ddToDstn = By.xpath("//div[contains(text(),'" + toDestination + "')]");
		
		
		System.out.println("Start.-clickDropdownDynamic");
		driver.findElement(ddFrom).click();
		hardWait(5000);
		
		driver.findElement(ddFromDstn).click();
		System.out.println("FROM" );
		hardWait(5000);
		
		driver.findElement(ddToDstn).click();
		System.out.println("TO");
		hardWait(5000);
		
		System.out.println("End.-clickDropdownDynamic");
	}
}
