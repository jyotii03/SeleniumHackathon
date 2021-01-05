package Hackathon.Selenium;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

public class Tca26 extends Hackathon_utility{

	public static void main(String[] args)throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		driver.findElement(By.linkText("Contacts")).click();
		waitExplicitly(30, driver.findElement(By.linkText("Create New View")));
		
		WebElement newLink = driver.findElement(By.linkText("Create New View"));
		clickObj(newLink, "New View");
		
		WebElement viewN = driver.findElement(By.xpath("//input[@id='fname']"));
		viewN.sendKeys("Jain");
		
		WebElement UviewN = driver.findElement(By.xpath("//input[@id='devname']"));
		UviewN.click();
		
		WebElement save = driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		clickObj(save, "Save");
		quitBrowser();
		logOut();
	}

}
