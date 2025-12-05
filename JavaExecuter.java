package SeleniumScript;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecuter {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		WebElement username=driver.findElement(By.id("username"));
		
		// Instead of send keys use this method when we not interact with the text box via sendkeys.
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','BalaramanR')",username);
		
		WebElement PassW=driver.findElement(By.id("password"));
		js.executeScript("arguments[0].setAttribute('value','26GJ80')", PassW);
		
		WebElement Clk=driver.findElement(By.id("login"));
		
		//Click action
		js.executeScript("arguments[0].click()", Clk);
		Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,1500)");
		System.out.println(js.executeScript("return window.pageYOffSet;"));
		
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
		
		

	}

}
