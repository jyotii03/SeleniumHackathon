package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCa11 extends Hackathon_utility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		WebElement newLink = driver.findElement(By.linkText("Create New View"));
		clickObj(newLink, "Create new view");
		Thread.sleep(3000);
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.sendKeys("Jyoti jain");
		Thread.sleep(3000);
		WebElement unique = driver.findElement(By.xpath("//input[@id='devname']"));
		unique.sendKeys("30");
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save '][1]"));
		clickObj(save, "Save button");
		Thread.sleep(3000);
		quitBrowser();
		
		
		
	}

}
