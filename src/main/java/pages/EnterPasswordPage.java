package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class EnterPasswordPage {

	WebDriver driver;

	public EnterPasswordPage(WebDriver driver) {
          this.driver = driver;
	}

	public void submitUserName(String password) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys(password);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.id("nextbtn")).click();
	}

}
