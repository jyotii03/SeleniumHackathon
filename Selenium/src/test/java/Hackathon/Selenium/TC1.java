package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC1 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
		waitExplicitly(5, ele);
		Thread.sleep(1000);
		ele.clear();
		ele.sendKeys("jyotitesting03@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		Thread.sleep(2000);
		quitBrowser();
	}

}
