package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca34 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		waitHomePage();
		Thread.sleep(3000);
		WebElement name = driver
				.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[1]/h1[1]/a[1]"));
		waitExplicitly(30, name);
	
		String pre = name.getText();
		name.click();

		WebElement editButton = driver.findElement(By.xpath("//img[@title='Edit Profile']"));
		clickObj(editButton, "Edit");

		driver.switchTo().frame(driver.findElement(By.id("contactInfoContentId")));

		Thread.sleep(3000);
		WebElement about = driver.findElement(By.xpath("//a[contains(text(),'About')]"));
		waitExplicitly(30, about);
		clickObj(about, "About");
		Thread.sleep(3000);

		WebElement lastn = driver.findElement(By.xpath("//input[@id='lastName']"));
		waitExplicitly(30, lastn);
		lastn.clear();
		lastn.sendKeys("ABCD");

		Thread.sleep(3000);
		WebElement save = driver.findElement(By.xpath("//input[@class='zen-btn zen-primaryBtn zen-pas']"));
		waitExplicitly(30, save);
		clickObj(save, "Save");

		Thread.sleep(3000);
		WebElement newName = driver.findElement(By.xpath("//span[@id='tailBreadcrumbNode']"));
		waitExplicitly(30, newName);

		String nw = newName.getText();
		if (nw.equalsIgnoreCase(pre)) {
			System.out.println("Failed");
		} else {
			System.out.println("Pass");
		}
		
		quitBrowser();
		
	}
	

}
