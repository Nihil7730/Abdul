package SeleniumScript;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class wait {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		
		
		Thread.sleep(3000);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));//implicit wait
		
		
	

		WebDriverWait myWait=new WebDriverWait(driver, Duration.ofSeconds(10)); //declaration Explicit wait
		
		myWait.until(ExpectedConditions.visibilityOfElementLocated(null)); //condition
		
		
		
		Wait<WebDriver> iWait=new FluentWait<WebDriver>(driver) //Fluent Wait
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement hello= myWait.until(new Function<WebDriver, WebElement>() 
		{
			public WebElement apply(WebDriver driver) {
				return driver.findElement(By.id("Any locator"));
			}
		});
		
		
		

	}

}
