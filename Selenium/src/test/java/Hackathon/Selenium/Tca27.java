package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tca27 extends Hackathon_utility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		waitHomePage();
		WebElement contact=  driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
		se.selectByVisibleText("Recently Created");
		Thread.sleep(3000);
		
		
		logOut();

		quitBrowser();
	}

}
