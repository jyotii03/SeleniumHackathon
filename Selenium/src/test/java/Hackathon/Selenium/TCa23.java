package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa23 extends Hackathon_utility {

	public static void main(String[] args) throws Exception{ 
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  Leads = driver.findElement(By.linkText("Leads"));
		clickObj(Leads, "Leads");
		Thread.sleep(2000);
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='hotlist_mode']")));
		se.selectByVisibleText("My Unread Leads");
		Thread.sleep(3000);
		
		quitBrowser();
		

	}

}
