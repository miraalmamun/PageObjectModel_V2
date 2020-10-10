package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	
WebDriver driver;
	
	public HomePage(WebDriver driver)
	{
		this.driver = driver;
	}

	public EnterUserNamePage goToLoginPage() {
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Zoho - Cloud Software Suite and SaaS Applications for Businesses"));
		driver.findElement(By.linkText("Login")).click();

		return new EnterUserNamePage(driver);
	}

}
