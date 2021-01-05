package Hackathon.Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca13 extends Hackathon_utility {

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		WebElement Merge = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/ul[1]/li[4]/span[1]/a[1]"));
		clickObj(Merge, "Merge Account");
		
		WebElement send = driver.findElement(By.xpath("//input[@id='srch']"));
		send.sendKeys("jyoti");
		
		WebElement click = driver.findElement(By.xpath("//input[@value='Find Accounts']"));
		clickObj(click, "Accounts");
		
		WebElement next =driver.findElement(By.xpath("//input[@value=' Next '][1]"));
		clickObj(next, "Next Button");
		
		WebElement mergeAcc = driver.findElement(By.xpath("//input[@value=' Merge '][1]"));
		clickObj(mergeAcc, "Merging accounts");
		
		Alert al = driver.switchTo().alert();
		System.out.println(al.getText());
		al.accept();
		
		quitBrowser();

	}

}
