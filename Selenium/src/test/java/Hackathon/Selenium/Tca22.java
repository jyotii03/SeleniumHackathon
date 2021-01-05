package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Tca22 extends Hackathon_utility{

	public static void main(String[] args)  throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  Leads = driver.findElement(By.linkText("Leads"));
		clickObj(Leads, "Leads");
		Thread.sleep(2000);
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
		se.selectByVisibleText("My Unread Leads");
		Thread.sleep(3000);
		
		logOut();
		Thread.sleep(5000);
		
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Testing123");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		clickObj(login, "Login");

		Thread.sleep(3000);


		quitBrowser();
		
	}

}
