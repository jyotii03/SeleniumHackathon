package Hackathon.Selenium;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;

public class Tca24 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
	
		launchBrowser();
		goTologinUrl();
		loginWithAd();

		   
		  Properties obj = new Properties();
		  FileInputStream objfile = new FileInputStream(System.getProperty("user.dir")+"/file.properties");
		  obj.load(objfile);
		
		  driver.findElement(By.linkText(obj.getProperty("Leads"))).click();	
		  driver.findElement(By.xpath(obj.getProperty("New"))).click();
		  driver.findElement(By.xpath(obj.getProperty("lastN"))).sendKeys("ABCD");
		  driver.findElement(By.xpath(obj.getProperty("company"))).sendKeys("ABCD");
		  driver.findElement(By.xpath(obj.getProperty("save"))).click();
		  
		
		Thread.sleep(3000);
		logOut();
		quitBrowser();
	}

}
