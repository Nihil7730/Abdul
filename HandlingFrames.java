package SeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingFrames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
//		driver.switchTo().frame(frame1);
		
		WebDriverWait MyWait=new WebDriverWait(driver, Duration.ofSeconds(3));
		MyWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frame1));
		
		
		driver.findElement(By.name("mytext1")).sendKeys("Hello entry");
		
		driver.switchTo().defaultContent();
		
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		
		driver.findElement(By.name("mytext2")).sendKeys("Hello entry2");
		
	}

}
