package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EnterUserNamePage {

	WebDriver driver;

	public EnterUserNamePage(WebDriver driver) {
		this.driver = driver;
	}

	public EnterPasswordPage submitUserName(String userName) {

		driver.findElement(By.id("login_id")).sendKeys(userName);
		// new WebDriverWait(driver,
		// Duration.ofSeconds(10)).until(ExpectedConditions.titleIs("Zoho Accounts"));

		new WebDriverWait(driver, Duration.ofSeconds(10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("nextbtn")));

		driver.findElement(By.id("nextbtn")).click();

		return new EnterPasswordPage(driver);
	}

}
