package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca35 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		waitHomePage();

		WebElement plus = driver.findElement(By.xpath("//img[@class='allTabsArrow']"));
		waitExplicitly(30, plus);
		clickObj(plus, "Plus");
		Thread.sleep(1000);

		WebElement customiseTab = driver.findElement(By.xpath("//input[@value='Customize My Tabs']"));
		waitExplicitly(30, customiseTab);
		clickObj(customiseTab, "Customise Tab");
		Thread.sleep(1000);

		WebElement select = driver.findElement(By.xpath("//option[@value='Forecasting3']"));
		waitExplicitly(30, select);
		clickObj(select, "Select");
		Thread.sleep(1000);

		WebElement remove = driver.findElement(By.xpath("//img[@class='leftArrowIcon']"));
		waitExplicitly(30, remove);
		clickObj(remove, "Remove");
		Thread.sleep(1000);

		WebElement save = driver.findElement(By.xpath("//td[@id='bottomButtonRow']//input[contains(@name,'save')]"));
		waitExplicitly(30, save);
		clickObj(save, "Click");
		Thread.sleep(1000);

		waitExplicitly(30, driver.findElement(By.xpath("//h1[contains(text(),'All Tabs')]")));
		Thread.sleep(3000);

		logOut();
		Thread.sleep(3000);
		// input[@id='password']
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Testing123");

		WebElement login = driver.findElement(By.xpath("//input[@id='Login']"));

		clickObj(login, "Login");

		Thread.sleep(3000);

		// input[@id='Login']

		quitBrowser();

	}

}
