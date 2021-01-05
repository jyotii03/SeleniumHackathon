package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa12  extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		WebElement edit = driver.findElement(By.linkText("Edit"));
		clickObj(edit, "Edit account");
		
		WebElement viewName = driver.findElement(By.xpath("//input[@id='fname']"));
		viewName.clear();
		viewName.sendKeys("Jalpa");
		Thread.sleep(3000);
		
		WebElement unique = driver.findElement(By.xpath("//input[@id='devname']"));
		unique.clear();
		unique.sendKeys("30");
		Thread.sleep(3000);
		
		Select acc = new Select(driver.findElement(By.id("fcol1")));
		acc.selectByVisibleText("Account Name");
		Thread.sleep(1000);

		Select acc1 = new Select(driver.findElement(By.id("fop1")));
		acc1.selectByVisibleText("contains");
		Thread.sleep(1000);
		
		WebElement acc2 =driver.findElement(By.xpath("//input[@id='fval1']"));
		acc2.sendKeys("a");
		Thread.sleep(1000);
		quitBrowser();
	}

}
