package SeleniumScript;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Utils.ExcelUtils;
import Utils.XpathUtils;

public class Datafromexecl {
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileReader reader=new FileReader("./src/test/resources/CONFIG/config.properties"); 
	    Properties props=new Properties(); 
	    props.load(reader);
	    String URL= props.getProperty("URL");
	  //  System.out.println(URL);
	    
	    
		
		WebDriver driver=new ChromeDriver();
		driver.get(URL);		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		String filepath=System.getProperty("user.dir")+"//TestData//TestDataDetails.xlsx";
		int rows=ExcelUtils.getRowCount(filepath, "sheet1");
		
		for(int i=1;i<=rows;i++) {
			
			
			String UN=ExcelUtils.getCellData(filepath, "sheet1", i, 0);
			String PW=ExcelUtils.getCellData(filepath, "sheet1", i, 1);
			String FN=ExcelUtils.getCellData(filepath, "sheet1", i, 2);
			String LN=ExcelUtils.getCellData(filepath, "sheet1", i, 3);
			String ADD=ExcelUtils.getCellData(filepath, "sheet1", i, 4);
			String CCN=ExcelUtils.getCellData(filepath, "sheet1", i, 5);
			String CVV=ExcelUtils.getCellData(filepath, "sheet1", i, 6);
			
			//WebElement US=(WebElement) XpathUtils.Uxsername;
			//US.sendKeys(UN);
			//WebElement dr=driver.findElement(By.id("username"));
			//dr.sendKeys(UN);
			driver.findElement(XpathUtils.Username).sendKeys(UN);
			
			
			WebElement username=driver.findElement(By.id("password"));
			username.sendKeys(PW);
			
			WebElement clk=driver.findElement(By.id("login"));
			System.out.println(clk.isEnabled());
			clk.click();
			
			
			Thread.sleep(5000);
			
			WebElement dropdown=driver.findElement(By.id("location"));
			Select drop=new Select(dropdown);
			drop.selectByVisibleText("Melbourne");

			
			WebElement dropdown1=driver.findElement(By.id("hotels"));
			//dropdown1.click();
			Select drop1=new Select(dropdown1);
			drop1.selectByVisibleText("Hotel Creek");
			
			WebElement dropdown3=driver.findElement(By.xpath("//*[@id=\"room_type\"]"));
			Select drop3=new Select(dropdown3);
			drop3.selectByVisibleText("Standard");
			
			WebElement dropdown4=driver.findElement(By.id("room_nos"));
			Select drop4=new Select(dropdown4);
			drop4.selectByIndex(3);
			
			//JavascriptExecutor run=(JavascriptExecutor)driver;
			
			//WebElement Check_In_Date=driver.findElement(By.id("datepick_in"));
		//	run.executeScript("arguments[0].setAttributes('value','20/5/2024')", Check_In_Date );
			
			
			WebElement dropdown5=driver.findElement(By.id("adult_room"));
			Select drop5=new Select(dropdown5);
			drop5.selectByIndex(2);
			
			WebElement dropdown6=driver.findElement(By.id("child_room"));
			Select drop6=new Select(dropdown6);
			drop6.selectByIndex(1);
			
			driver.findElement(By.id("Submit")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("radiobutton_0")).click();
			
			driver.findElement(By.id("continue")).click();
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("first_name")).sendKeys(FN);
			
			driver.findElement(By.id("last_name")).sendKeys(LN);
			
			driver.findElement(By.id("address")).sendKeys(ADD);
			
			driver.findElement(By.id("cc_num")).sendKeys(CCN);
			
			WebElement cc=driver.findElement(By.id("cc_type"));
			Select CC=new Select(cc);
			CC.selectByValue("MAST");   
			
			WebElement Mon=driver.findElement(By.id("cc_exp_month"));
			Select Month=new Select(Mon);
			Month.selectByValue("3"); 
			
			
			WebElement yr=driver.findElement(By.id("cc_exp_year"));
			Select Year=new Select(yr);
			Year.selectByValue("2024"); 
			
			driver.findElement(By.id("cc_cvv")).sendKeys(CVV);
			
			Thread.sleep(3000);
			
			driver.findElement(By.id("book_now")).click();
			
			
			driver.close();
			
		    System.out.println("Hotel booking successfully");
			
			System.out.println("The Script passed");

			
			
		}
		
		

	}

}
