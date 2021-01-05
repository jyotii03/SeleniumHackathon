package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca33 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();

		waitHomePage();
		
		WebElement u=driver.findElement(By.id("home_Tab"));
	waitExplicitly(30, u);
		u.click();
		
		

		Thread.sleep(3000);
		WebElement us=driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[1]/h1[1]/a[1]"));
		waitExplicitly(30, us);;
		us.click();
		
		quitBrowser();
	}

}
