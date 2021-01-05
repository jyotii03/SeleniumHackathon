package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa15 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  oppur = driver.findElement(By.linkText("Opportunities"));
		clickObj(oppur, "Oppurtunity");
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='fcf']")));
		se.selectByVisibleText("Won");
		Thread.sleep(1000);
		quitBrowser();

	}

}
