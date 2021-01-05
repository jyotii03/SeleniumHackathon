package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca30 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();

		waitHomePage();
		WebElement contact = driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");

		waitExplicitly(30, driver.findElement(By.linkText("Create New View")));

		WebElement newViewLink = driver.findElement(By.linkText("Create New View"));
		clickObj(newViewLink, "New link");

		waitExplicitly(30, driver.findElement(By.xpath("//input[@id='devname']")));

		WebElement uniqueName = driver.findElement(By.xpath("//input[@id='devname']"));
		uniqueName.sendKeys("EFGH");
		uniqueName.click();

		WebElement save = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/div[2]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[1]"));
		clickObj(save, "Save");
		Thread.sleep(2000);

		System.out.println("Pass :" + driver.findElement(By.xpath("//div[@class=\"errorMsg\"][1]")).getText());

		logOut();
		quitBrowser();

		// input[@id='devname']
	}

}
