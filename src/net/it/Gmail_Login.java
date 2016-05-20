package net.it;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		String appUrl = "https://accounts.google.com";

		driver.get(appUrl);

		driver.manage().window().maximize();

		String expectedTitle = "Sign in - Google Accounts";

		String actualTitle = driver.getTitle();

		if (expectedTitle.equals(actualTitle)) {

			System.out.println("correct title displayed");
		} else {
			System.out.println("incorrect title displayed");
		}

		WebElement username = driver.findElement(By.id("Email"));
		username.clear();
		username.sendKeys("TestSelenium");

		WebElement next = driver.findElement(By.id("next"));
		next.click();

		WebElement password = driver.findElement(By.id("Passwd"));
		password.clear();
		password.sendKeys("password123");
		
		driver.close();
		System.out.println("test successful");

		System.exit(0);

	}

}
