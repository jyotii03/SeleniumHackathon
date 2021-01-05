package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca31 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		waitHomePage();
		WebElement contact=  driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");

		waitExplicitly(30,  driver.findElement(By.linkText("Create New View")));
		
		WebElement newViewLink = driver.findElement(By.linkText("Create New View"));
		clickObj(newViewLink, "New link");
		
		waitExplicitly(30,  driver.findElement(By.xpath("//input[@id='fname']")));

		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.sendKeys("ABCD");
		viewName.click();
		System.out.println("Pass :View Name button was clicked");
		
		WebElement uniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		uniqueName.sendKeys("EFGH");
		uniqueName.click();
		System.out.println("Pass :Unique View Name button was clicked");
		
		WebElement cancel =  driver.findElement(By.xpath("//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]"));
		clickObj(cancel, "Cancel");
		logOut();
		quitBrowser();

	}

}
