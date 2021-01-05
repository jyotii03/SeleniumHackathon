package Hackathon.Selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Tca37 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		waitHomePage();
		WebElement date = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[1]/div[1]/div[1]/div[1]/span[2]/a[1]"));
		clickObj(date, "Date");
		
		WebElement fourPm = driver.findElement(By.xpath("//a[contains(text(),'4:00 PM')]"));
		waitExplicitly(30, fourPm);
		clickObj(fourPm, "4 Pm");
		
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
				
				WebElement time2 = driver.findElement(By.xpath("//div[contains(text(),'7:00 PM')]"));
				action.moveToElement(time2).build().perform();
				Thread.sleep(3000);
				
				
				WebElement reOcccurance= driver.findElement(By.xpath("//input[@id='IsRecurrence']"));
				clickObj(reOcccurance, "Reoccurance");
				Thread.sleep(3000);
				

				WebElement weekly= driver.findElement(By.xpath("//input[@id='rectypeftw']"));
				waitExplicitly(30, weekly);
				clickObj(weekly, "Weekly");
				
				WebElement endWeek= driver.findElement(By.xpath("//input[@id='RecurrenceEndDateOnly']"));
				endWeek.sendKeys("1/19/2021");
				
				
				
				WebElement save = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
				clickObj(save, "Save");
				Thread.sleep(3000);
				
		
				
				WebElement calenderView = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/div[1]/div[2]/span[2]/a[3]/img[1]"));
				clickObj(calenderView, "Calender View");
				
				waitExplicitly(30,driver.findElement(By.xpath("//th[contains(text(),'Tuesday')]"))) ;
				Thread.sleep(3000);
				quitBrowser();
				
				
				
				
				//input[@id='IsRecurrence']
				
				
				

	}

}
