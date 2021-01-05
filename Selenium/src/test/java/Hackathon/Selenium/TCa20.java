package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCa20 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  Leads = driver.findElement(By.linkText("Leads"));
		clickObj(Leads, "Leads");
		Thread.sleep(2000);
		
		quitBrowser();
	}

}
