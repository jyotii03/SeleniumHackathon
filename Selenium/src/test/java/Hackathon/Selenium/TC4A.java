package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC4A extends Hackathon_utility{

	public static void main(String[] args) throws Exception{
		/*launch application
		 * click forget password
		 * 
		
		
*/

		launchBrowser();
		goTologinUrl();
		WebElement ele = driver.findElement(By.xpath("//input[@name='username']"));
		Thread.sleep(1000);
		ele.clear();
		enterText(ele, "jyotitesting03-t64c@force.com", "username");
		waitExplicitly(5, ele);
		
		Thread.sleep(1000);
		driver.findElement(By.linkText("Forgot Your Password?")).click();
		waitExplicitly(5, driver.findElement(By.xpath("//input[@id='un']")));
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='un']")).sendKeys("jyotitesting03-t64c@force.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(1000);
		waitExplicitly(5000, driver.findElement(By.linkText("Return to Login")));
		Thread.sleep(1000);
		driver.findElement(By.linkText("Return to Login")).click();
		Thread.sleep(3000);
		quitBrowser();
	}
	

}
//driver.findElement(By.xpath("//input[@name='username']"))