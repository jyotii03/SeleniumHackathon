package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Tca32 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();

		waitHomePage();
		WebElement contact = driver.findElement(By.linkText("Contacts"));
		clickObj(contact, "Contact tab");

		WebElement newButton = driver.findElement(By.xpath("//input[@value=' New ']"));
		clickObj(newButton, "New");

		waitExplicitly(30, driver.findElement(By.xpath("//input[@id='name_lastcon2']")));
		WebElement lastN = driver.findElement(By.xpath("//input[@id='name_lastcon2']"));
		lastN.sendKeys("Indian");

		WebElement AccName = driver.findElement(By.xpath(
				"/html[1]/body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[2]/div[3]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/span[1]/input[1]"));
		AccName.sendKeys("Global Media");

		WebElement save = driver.findElement(By.xpath(
				"//body[1]/div[1]/div[2]/table[1]/tbody[1]/tr[1]/td[2]/form[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/input[2]"));
		clickObj(save, "Save");
		Thread.sleep(2000);

		System.out.println(driver.findElement(By.xpath("//div[@class='errorMsg']")).getText());

		System.out.println(driver.findElement(By.xpath("//div[@class='pbError']")).getText());

		logOut();
		quitBrowser();

		// input[@value=" New "]
		// input[@id='name_lastcon2']
	}

}
