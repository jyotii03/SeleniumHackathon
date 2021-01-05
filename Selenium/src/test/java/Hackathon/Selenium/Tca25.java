package Hackathon.Selenium;

import java.io.FileInputStream;

import java.util.Properties;

import org.openqa.selenium.By;

public class Tca25 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();

		Properties obj = new Properties();
		FileInputStream objfile = new FileInputStream(System.getProperty("user.dir") + "/file.properties");
		obj.load(objfile);

		driver.findElement(By.linkText(obj.getProperty("25contactsTab"))).click();
		waitExplicitly(5, driver.findElement(By.xpath(obj.getProperty("25newC"))));
		driver.findElement(By.xpath(obj.getProperty("25newC"))).click();
		driver.findElement(By.xpath(obj.getProperty("25lastN"))).sendKeys("Jain");
		driver.findElement(By.xpath(obj.getProperty("25accN"))).click();
		driver.switchTo().activeElement();
		Thread.sleep(3000);
		// driver.findElement(By.linkText(obj.getProperty("25detail"))).sendKeys("jyoti");;
		// driver.findElement(By.xpath(obj.getProperty("25go"))).click();
		driver.switchTo().defaultContent();

		driver.findElement(By.xpath(obj.getProperty("25save"))).click();

		quitBrowser();
	}

}
