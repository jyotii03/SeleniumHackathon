package Hackathon.Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCa14 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		
	WebElement lastAct = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
	clickObj(lastAct, "Report");
	
	WebElement dateField = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
	clickObj(dateField, "Date");

	WebElement dateField1 = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
	clickObj(dateField1, "Created Date");
	
	WebElement save= driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	clickObj(save, "Save");
	
	driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("Summary");

	driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]")).click();
	quitBrowser();
	
	

//	/html[1]/body[1]/div[17]/ul[1]/li[1]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/table[1]/tbody[1]/tr[2]/td[1]/a[1]/em[1]/span[1]

}
}