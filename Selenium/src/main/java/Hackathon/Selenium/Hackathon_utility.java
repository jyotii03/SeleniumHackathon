package Hackathon.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hackathon_utility {

	public static WebDriver driver;

	public static void launchBrowser() throws Exception {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public static void waitExplicitly(int iSeconds, WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, iSeconds);
		wait.ignoring(NoSuchElementException.class, ElementNotVisibleException.class);
		wait.until(ExpectedConditions.visibilityOf(ele));

	}

	public static void waitHomePage() {

		waitExplicitly(3, driver.findElement(By.xpath(
				"//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));
	}

	public static void logOut() throws Exception {
		WebElement userMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));

		clickObj(userMenu, "usermenu");
		Thread.sleep(1000);
		waitExplicitly(5, driver.findElement(By.linkText("Logout")));
		WebElement logOut = driver.findElement(By.linkText("Logout"));
		clickObj(logOut, "Log Out");

		

	}

	public static void goTologinUrl() {
		driver.get("https:login.salesforce.com/");

	}

	public static void quitBrowser() throws Exception {
		Thread.sleep(1000);
		driver.quit();
		System.out.println("Sucessfully Quitted the Browser");

	}

	public static void loginToSales() throws Exception {

		WebElement userN = driver.findElement(By.xpath("//input[@name='username']"));
		waitExplicitly(5, userN);
		Thread.sleep(1000);
		userN.clear();
		userN.sendKeys("jyotitesting03-t64c@force.com");
		WebElement passW = driver.findElement(By.xpath("//input[@type='password']"));
		passW.sendKeys("Testing123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		Thread.sleep(3000);

	}

	public static void clickObj(WebElement obj, String objName) {
		if (obj.isDisplayed()) {
			obj.click();
			System.out.println("Pass :" + objName + " button is clicked.");
		} else {
			System.out.println("Fail :" + objName + " button is not displayed, please check the application.");

		}
	}

	public static void enterText(WebElement ele, String textval, String elename) throws Exception {

		if (ele.isDisplayed()) {
			Thread.sleep(4000);
			ele.sendKeys(textval);
			System.out.println("Pass :" + textval + " value is enetered in " + elename + " field.");
		} else {
			System.out.println("Fail :" + textval + " field does not exit please check the application.");
		}

	}

	public static void loginWithAd() throws Exception {
		WebElement userN = driver.findElement(By.xpath("//input[@name='username']"));
		waitExplicitly(5, userN);
		Thread.sleep(1000);
		userN.clear();
		userN.sendKeys("jyotitesting03-t64c@force.com");
		WebElement passW = driver.findElement(By.xpath("//input[@type='password']"));
		passW.sendKeys("Testing123");
		driver.findElement(By.xpath("//input[@name='rememberUn']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		driver.findElement(By.xpath("//input[@value='No Thanks']")).click();
		driver.findElement(By.xpath("//span[@class=\"checkbox\"][2]")).click();
		driver.findElement(By.xpath("//input[@value='Send to Salesforce']")).click();
		waitExplicitly(7000, driver.findElement(By.xpath(
				"//body/div[@id='contentWrapper']/div[@id='AppBodyHeader']/div[1]/div[1]/nav[1]/ul[1]/li[1]/a[1]")));

	}

}
//driver.findElement(By.xpath("//div[@id=\"userNav-arrow\"]")).click();
//Thread.sleep(4000);
//driver.findElement(By.linkText("Logout")).click();
//Thread.sleep(3000);
