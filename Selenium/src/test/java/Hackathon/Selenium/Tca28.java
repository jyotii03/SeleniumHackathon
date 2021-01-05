package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tca28 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		waitHomePage();
		WebElement contact=  driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");
		
		Select dropDn = new Select (driver.findElement(By.xpath("//select[@id='fcf']")));
		dropDn.selectByVisibleText("My Contacts");
		
		WebElement go = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]"));
		clickObj(go,"Go");
		
		waitExplicitly(30, driver.findElement(By.xpath("//a[@id='create-new-view']")));
		
		logOut();
		quitBrowser();
		
		
	}

}