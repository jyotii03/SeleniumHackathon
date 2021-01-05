package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TC7 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement userMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));

		clickObj(userMenu, "usermenu");
		Thread.sleep(1000);

		WebElement Setting = driver
				.findElement(By.xpath("//tbody/tr[1]/td[3]/div[1]/div[3]/div[1]/div[1]/div[2]/div[3]/a[2]"));
		clickObj(Setting, "my setting");
		Thread.sleep(1000);

		// waitExplicitly(10,
		// driver.findElement(By.xpath("//span[@id='PersonalInformation_font']")));

		WebElement personal = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[1]/div[4]/div[2]/a[1]"));
		clickObj(personal, "Personal");
		Thread.sleep(1000);

		WebElement history = driver.findElement(By.xpath("//span[@id='LoginHistory_font']"));
		clickObj(history, "login history");
		Thread.sleep(1000);
//		
//		WebElement download = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div[3]/div[1]/div[1]/div[2]/div[1]/a[1]"));
//		clickObj(download, "Downlaod link");
//		Thread.sleep(1000);

		WebElement display = driver.findElement(By.xpath("//span[contains(text(),'Display & Layout')]"));
		clickObj(display, "display button");
		Thread.sleep(1000);

		WebElement customise = driver.findElement(By.xpath("//span[contains(text(),'Customize My Tabs')]"));
		clickObj(customise, "Tab");
		Thread.sleep(1000);

		Select se = new Select(driver.findElement(By.id("p4")));
		se.selectByVisibleText("Salesforce Chatter");
		Thread.sleep(1000);

		WebElement ele = driver.findElement(By.xpath("//option[@value='report']"));

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", ele);

		Thread.sleep(1000);

		WebElement emailTab = driver.findElement(By.xpath("//span[@id='EmailSetup_font']"));
		clickObj(emailTab, "Email Button");

		WebElement emailSetting = driver.findElement(By.xpath("//span[@id='EmailSettings_font']"));
		clickObj(emailSetting, "My Email setting");

		driver.findElement(By.xpath("//input[@id='use_external_email1'][1]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//input[@value=' Save ']")).click();
		Thread.sleep(1000);

		WebElement calender = driver.findElement(By.xpath("//span[contains(text(),'Calendar & Reminders')]"));
		clickObj(calender, "Calendar TAb");
		Thread.sleep(1000);

		WebElement activity = driver.findElement(By.xpath("//span[contains(text(),'Activity Reminders')]"));
		clickObj(activity, "Reminader tab");
		Thread.sleep(2000);

		WebElement button = driver.findElement(By.xpath("//input[@value='Open a Test Reminder']"));
		clickObj(button, "Open Reminader tab");
		Thread.sleep(3000);

		quitBrowser();

	}

}
