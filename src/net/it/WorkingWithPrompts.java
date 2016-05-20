package net.it;

import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithPrompts {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void ExampleForPrompts() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sager/Desktop/prompts.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@onclick = 'promptFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		driver.switchTo().alert().sendKeys("Hello");
		alert.accept();
		System.out.println(alert.getText());
	}
}
