package Hackathon.Selenium;

import org.openqa.selenium.By;

public class TC5 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		
		launchBrowser();
		goTologinUrl();
		loginToSales();
		
		driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[@class=\"checkbox\"][2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();
		Thread.sleep(1000);
		waitExplicitly(7000, driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));
		driver.findElement(By.xpath("//div[@id=\"userNav-arrow\"]")).click();
		Thread.sleep(4000);
		quitBrowser();
	 

	}

}
