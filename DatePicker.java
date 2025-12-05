package SeleniumScript;

import java.time.LocalDate;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
try {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://jqueryui.com/datepicker/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		LocalDate CurrentDte= null;
		CurrentDte=LocalDate.now();
		System.out.println(CurrentDte);
		
		String date=CurrentDte.toString();
		System.out.println(date);
		
		Thread.sleep(1000);
		js.executeScript("document.getElementById('datepicker').value = arguments[0];", date);
		WebElement Clk=driver.findElement(By.xpath("//input[@id=\"datepicker\"]"));
		Clk.click();
		Thread.sleep(5000);
		js.executeScript("arguments[0].click()", Clk);
		Thread.sleep(5000);
}
catch (Exception e) {
	driver.close();
}
		
		

	}

}
