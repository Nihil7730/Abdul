package SeleniumScript;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerNormal {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String date="15";
		String month="October";
		String Year="2000";
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@class='hasDatepicker']")).click();
		
		while(true) {
			
			String TotalMonth=driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String TotalYear=driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(TotalMonth.equals(month) && TotalYear.equals(Year)) {
				break;
			}
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
			
		}
		
		List<WebElement> CurrentDate=driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		for(WebElement SelectDate:CurrentDate) {
			if(SelectDate.getText().equals(date)) {
				SelectDate.click();
				break;
			}
		}
		
		//driver.quit();
		
		

	}

}
