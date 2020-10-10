package pages;

import org.openqa.selenium.WebDriver;

public class LaunchPage {
	
	WebDriver driver;
	
	public LaunchPage(WebDriver driver)
	{
		this.driver = driver;
	}

	public HomePage navigateToHomePage() {

		driver.get("https://www.zoho.com/");
		System.out.println(driver.getTitle());

		return new HomePage(driver);

	}

}
