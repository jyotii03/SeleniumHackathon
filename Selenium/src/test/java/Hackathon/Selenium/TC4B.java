package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4B extends Hackathon_utility{

	public static void main(String[] args)throws Exception {
		/*launch username 
		 * enter wrong user name 
		 * enter wrong password
		
		 * 
		 */
		launchBrowser();
		goTologinUrl();
		WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
		waitExplicitly(5, ele);
		Thread.sleep(1000);
		ele.clear();
		ele.sendKeys("Username123");
		Thread.sleep(1000);
		WebElement passW = driver.findElement(By.xpath("//input[@type='password']"));
		passW.sendKeys("Password");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[@role='alert']")).getText());
		Thread.sleep(2000);
		quitBrowser();
		
	}

}
