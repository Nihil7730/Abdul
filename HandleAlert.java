package SeleniumScript;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait Mywait=new WebDriverWait(driver, Duration.ofSeconds(5));
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
		driver.manage().window().maximize();
		
		
		 //Normal Alert
		
		driver.findElement(By.id("alertexamples")).click();
//		
//		Alert Myalert=driver.switchTo().alert();
//		System.out.println(Myalert.getText());
//		Thread.sleep(3000);
//		Myalert.accept();
		
		//Using Explicite wait to handle alert
		
//		WebDriverWait MyWait=new WebDriverWait(driver,Duration.ofSeconds(3));
//		Alert curaler=Mywait.until(ExpectedConditions.alertIsPresent());
//		curaler.accept();
//		
		//JavaScript Executor
		try {
		JavascriptExecutor Js=(JavascriptExecutor)driver;
		Js.executeScript("window.alert=Function{};");
		}
		catch(Exception e) {
		}
		
		
		
		// Confirmation alert
		
//		driver.findElement(By.id("confirmexample")).click();
//		System.out.println(Myalert.getText());
//		Thread.sleep(3000);
//		Myalert.dismiss();
//		System.out.println("Cancel the alert");
//		
//		driver.findElement(By.id("promptexample")).click();
//		System.out.println(Myalert.getText());
//		Thread.sleep(3000);
//		Myalert.sendKeys("Successfully entered the values via prompt comments");
//		Myalert.accept();
//		System.out.println("Accept the alert");
//		
		//Another option to handle the alert without using SwitchTO method
		//Using Explicite Wait
		
//       driver.findElement(By.id("alertexamples")).click();
//		
//		Alert Waitalert=Mywait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(Waitalert.getText());
//		Thread.sleep(3000);
//		Waitalert.accept();
//		
//		
//		
//		
//		Thread.sleep(3000);
		driver.close();

	}

}
