package net.it;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WorkingWithConfirmationPopus {

	WebDriver driver = new FirefoxDriver();

	@Test
	public void ExampleForConfirmation() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sager/Desktop/confirmation.html");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@onclick='confirmFunction()']")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.dismiss();
	}
}
