package Def;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;


public class logindef {

	public static WebDriver driver;
	
	 
	
	@Given("User should navigate the web application")
	public void UserShouldNavigateTheWebApplication() throws IOException {
		
		
		FileReader reader=new FileReader("./src/test/resources/config.properties"); 
	    Properties props=new Properties(); 
	    props.load(reader);
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		
		driver.get(props.getProperty("SearchLink"));
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	public void useName() {
		
		WebElement dr=driver.findElement(By.id("username"));
		dr.sendKeys("userName");
	}
	
	public void password() {
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys();
		
		
	}
	
	public void btn() {
		
		driver.findElement(By.id("login")).click();;
			
	}
	
	

}
