package com.POM.PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class DriverPage {
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "C:\\Users\\farja\\driver\\chromedriver.exe";
	static String url = "https://www.facebook.com/login/";

	static String geckoDriver = "webdriver.gecko.driver";
	static String geckoDriverLocation = "/Users/geckodriver";

	WebDriver driver;

	@Parameters("browser")
	@BeforeClass
	// if we are not using a testng.xml file and instead want to provide the
	// parameter directly through annotations,
	// with import we need to use @Optional along with @Parameters
	public void testDriver(@Optional("chrome") String browser) throws Exception {
		// public void testDriver(String browser) throws Exception{

		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(geckoDriver, geckoDriverLocation);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(chromeDriver, driverLocation);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(url);
		Thread.sleep(5000);
	}

	@AfterTest
	public void closeBrowser() {

		driver.close();
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}
}
