package net.it;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithAlerts {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void Example() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sager/Desktop/alerts.html");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@onclick='alertFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.accept();
	}
}
