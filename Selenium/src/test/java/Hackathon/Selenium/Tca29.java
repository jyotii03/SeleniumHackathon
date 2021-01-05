package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca29 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		waitHomePage();
		WebElement contact=  driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");
		
		
		WebElement contactName =  driver.findElement(By.linkText("kumar, Amita"));
		clickObj(contactName, "Amita");
		
		waitExplicitly(30, driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/div[2]/h2[1]")));
		
		Thread.sleep(3000);
		
		logOut();
		quitBrowser();
		
	}

}
