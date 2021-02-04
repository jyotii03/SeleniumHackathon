package Hackathon.Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TCa14 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		waitHomePage();
		WebElement Account = driver.findElement(By.xpath("//li[@id='Account_Tab']"));
		clickObj(Account, "Account button");
		
		
	WebElement lastAct = driver.findElement(By.linkText("Accounts with last activity > 30 days"));
	clickObj(lastAct, "Report");
	
	WebElement dateField = driver.findElement(By.xpath("//input[@id='ext-gen20']"));
	clickObj(dateField, "Date");

	
	WebElement datepick = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/div[1]/form[1]/div[1]/div[3]/input[1]"));
	datepick.sendKeys("1/19/2021");
	
	WebElement dateField1 = driver.findElement(By.xpath("//img[@id='ext-gen152']"));
	clickObj(dateField1, "Created Date");
	
	WebElement save= driver.findElement(By.xpath("//button[contains(text(),'Save')]"));
	clickObj(save, "Save");

	
	driver.findElement(By.xpath("//input[@id='saveReportDlg_reportNameField']")).sendKeys("Hackathon");
	Thread.sleep(3000);

	WebElement save3 = driver.findElement(By.xpath("//button[contains(text(),'Save and Run Report')]"));
	waitExplicitly(30,save3);
	save3.click();
	Thread.sleep(10000);
	save3.click();
	
	
	
	quitBrowser();
	

}
}