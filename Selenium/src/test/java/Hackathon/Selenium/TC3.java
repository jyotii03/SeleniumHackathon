package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC3 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		/* 
		 1. login page
		 provide user name and password 
		 click remeber me and click login to saleforce 
		// TODO Auto-generated method stub
*/
		launchBrowser();
		goTologinUrl();
		WebElement userN= driver.findElement(By.xpath("//input[@name='username']"));
		waitExplicitly(5, userN);
		Thread.sleep(1000);
		userN.clear();
		userN.sendKeys("jyotitesting03-t64c@force.com");
		WebElement passW = driver.findElement(By.xpath("//input[@type='password']"));
		passW.sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		driver.findElement(By.xpath("//span[@class=\"checkbox\"][2]")).click();
		driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();
		waitExplicitly(7000, driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));
		driver.findElement(By.xpath("//div[@id=\"userNav-arrow\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
	
	
		quitBrowser();
		
		
	}

}
//input[@value='No Thanks']
//span[@class='form-element_label']
//input[@value='Send to Salesforce']