package Hackathon.Selenium;

public class TC2 extends Hackathon_utility{

	public static void main(String[] args) throws Exception {
		// Test valid username and password login
		launchBrowser();
		goTologinUrl();
		loginToSales();
		quitBrowser();
	}

}
