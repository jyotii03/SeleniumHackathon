package Hackathon.Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class TCa36 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		waitHomePage();
		
		WebElement date = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[2]/a[1]"));
		clickObj(date, "Date");
		
		waitExplicitly(30, driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]")));
		
		WebElement time = driver.findElement(By.xpath("//a[contains(text(),'8:00 PM')]"));
		clickObj(time, "Time");
		
		WebElement event = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[4]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/a[1]/img[1]"));
		waitExplicitly(30, event);
		clickObj(event, "Event");
		
		
		
		
ArrayList<String> win=new ArrayList<String>(driver.getWindowHandles());
		
		driver.switchTo().window(win.get(1));
		
		WebElement popUp = driver.findElement(By.xpath("//a[contains(text(),'Other')]"));
		clickObj(popUp,"Popup");
		
		driver.switchTo().window(win.get(0));
		Thread.sleep(3000);

		WebElement endTime= driver.findElement(By.xpath("//input[@id='EndDateTime_time']"));
		clickObj(endTime, "Endtime");
		Actions action = new Actions(driver);
		WebElement time2 = driver.findElement(By.xpath("//div[contains(text(),'9:30 PM')]"));
		action.moveToElement(time2).build().perform();
		Thread.sleep(3000);
		
		WebElement save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		clickObj(save, "Save");
		Thread.sleep(3000);
		waitExplicitly(30, driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/h1[1]")));
		
		Thread.sleep(3000);
		
		quitBrowser();
		
}
}