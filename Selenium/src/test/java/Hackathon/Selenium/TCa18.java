package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCa18 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  oppur = driver.findElement(By.linkText("Opportunities"));
		clickObj(oppur, "Oppurtunity");
		
		WebElement  oppurStuck = driver.findElement(By.linkText("Stuck Opportunities"));
		clickObj(oppurStuck, "Stuck Oppurtunity");
		
		quitBrowser();
		
	}

}
