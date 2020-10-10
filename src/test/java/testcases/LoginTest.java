package testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pages.EnterPasswordPage;
import pages.EnterUserNamePage;
import pages.HomePage;
import pages.LaunchPage;

public class LoginTest {

	// Problem in this way to build a framework
	// Passing of driver object in the every methods
	// Other Object also Example: Extends Reports and log
	//So far I am creating driver object in @Test level and passing it to the page classes.
	//I am passing driver through every method. This is not a good approach. Because I am ending up 
	//writing extra codes
	//Second solution Look at V2. This is V1.
	//------------------------------Below about Version Two-------------------------
	//In second solution why don't you pass it through constructor
	//Every Page class used to have it's own driver object and constructor. I will initialize the driver
	//through constructor
	//At the time of initialize in A Page I will send A driver object in it, So driver of the page initialize
	//So driver don't need to pass every method.
	//One page class creates the object of Another Page class
	//One page class initialize Another page class-->When I initialize I will pass driver again
	//One page class methods will give you another page class. This is the Golden principle of
	//Page Object Model

	@Test
	public void loginTest() {

		// ExtentReports rep = new ExtentReports();
		// ExtentTest test = rep.createTest("loginTest".toUpperCase());
		// test.log(Status.INFO, "initializing browser");

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		LaunchPage lp = new LaunchPage(driver);
		HomePage hp = lp.navigateToHomePage();
		EnterUserNamePage userNamePage = hp.goToLoginPage();
		EnterPasswordPage passwordPage = userNamePage.submitUserName("miraalmamun@gmail.com");
		passwordPage.submitUserName("Mimo949658");
		driver.quit();

	}

}
