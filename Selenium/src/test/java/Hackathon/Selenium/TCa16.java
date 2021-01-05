package Hackathon.Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa16 extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement  oppur = driver.findElement(By.linkText("Opportunities"));
		clickObj(oppur, "Oppurtunity");
		

		WebElement go = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[2]/form[1]/div[1]/span[1]/span[1]/input[1]"));
		clickObj(go, "Oppurtunity");
		
		

		WebElement newC = driver.findElement(By.xpath("//input[@value='New Opportunity']"));
		clickObj(newC, " New Oppurtunity");
		//input[@value=' Go! ']
		//input[@value='New Opportunity']
		
		
		driver.findElement(By.xpath("//input[@id='opp3']")).sendKeys("BuyingStocks");
		driver.findElement(By.xpath("//tbody/tr[2]/td[2]/div[1]/span[1]/a[1]/img[1]")).click();
		
		driver.switchTo().frame(0);
		
		ArrayList<String> windowsTabs = new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(windowsTabs.get(0));
		
		
		
		Select se = new Select(driver.findElement(By.xpath("//select[@id='opp11']")));
		se.selectByVisibleText("Proposal");
		Thread.sleep(1000);
	
		
		WebElement lead = driver.findElement(By.xpath("//input[@id='opp12']"));
		lead.clear();
		lead.sendKeys("75");
		Thread.sleep(3000);
		
		Select se1 = new Select(driver.findElement(By.xpath("//select[@id='opp6']")));
		se1.selectByVisibleText("Customer Event");
		Thread.sleep(1000);
		
		
		WebElement save = driver.findElement(By.xpath("//input[@value=' Save ']"));
		clickObj(save, "Save");
		Thread.sleep(3000);
		
		
		quitBrowser();
	}
}