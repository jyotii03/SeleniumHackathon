package Hackathon.Selenium;




public class TC9 extends Hackathon_utility {

	public static void main(String[] args) throws Exception {
		launchBrowser();
		goTologinUrl();
		loginWithAd();
		logOut();
//		WebElement userMenu = driver.findElement(By.xpath("//span[@id='userNavLabel']"));
//
//		clickObj(userMenu, "usermenu");
//		Thread.sleep(3000);
//		waitExplicitly(5, driver.findElement(By.linkText("Logout")));
//		WebElement logOut = driver.findElement(By.linkText("Logout"));
//		clickObj(logOut, "Log Out");
//
//		Thread.sleep(3000);

		quitBrowser();
	}

}
