package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa19  extends Hackathon_utility{

	public static void main(String[] args)  throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  oppur = driver.findElement(By.linkText("Opportunities"));
		clickObj(oppur, "Oppurtunity");
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='quarter_q']")));
		se.selectByVisibleText("Next FQ");
		Thread.sleep(1000);
		
		Select se2= new Select(driver.findElement(By.xpath("//select[@id='open']")));
		se2.selectByVisibleText("Open Opportunities");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@value='Run Report' ]")).click();
		Thread.sleep(5000);
		
		quitBrowser();
	}

}
