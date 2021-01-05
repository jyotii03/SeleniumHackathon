package Hackathon.Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC8 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement userMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));

		clickObj(userMenu, "usermenu");
		Thread.sleep(3000);
		
		WebElement console = driver.findElement(By.linkText("Developer Console"));
		clickObj(console, "Developer Console");
		Thread.sleep(3000);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windowsTabs.get(0));
		driver.close();
		quitBrowser();
		

	}

}
