package Hackathon.Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC6 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement userMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));

		clickObj(userMenu, "usermenu");
		Thread.sleep(1000);

		WebElement profile = driver.findElement(By.linkText("My Profile"));
		clickObj(profile, "My profile");
		Thread.sleep(2000);
		
		WebElement edit = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickObj(edit, "edit profile");
		Thread.sleep(2000);
		
	
		driver.switchTo().parentFrame().switchTo().frame(1);
		
		//waitExplicitly(5, ele);
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		
		//river.findElement(By.xpath("iframe[@id='contactInfoContentId']")).click();
		
		driver.switchTo().window(windowsTabs.get(0));
	
		
		//driver.findElement(By.xpath("//*[@id='aboutTab']/a")).click();
		Thread.sleep(2000);
		
		
		
		quitBrowser();

	}

}
//waitExplicitly(7000, driver.findElement(By.xpath("//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));
//driver.findElement(By.xpath("//span[@id='userNavLabel']")).click();
//Thread.sleep(4000);