package Hackathon.Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TCa10 extends Hackathon_utility{
	
	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		WebElement newAcc = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]"));
		clickObj(newAcc, "New Account");
		
		driver.findElement(By.xpath("//input[@id='acc2']")).sendKeys("jyoti");
		Select se = new Select(driver.findElement(By.id("acc6")));
		se.selectByVisibleText("Partner");
		Thread.sleep(1000);

		WebElement save = driver.findElement(By.xpath("//input[@value=' Save '][1]"));
		clickObj(save, "Save button");
		Thread.sleep(3000);
		quitBrowser();
	}
	

}
