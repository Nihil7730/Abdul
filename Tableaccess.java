package SeleniumScript;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tableaccess {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
		//number of row
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("number of rows "+rows);
		
		//number of column
		int column=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("number of column "+column);
		
		//read the specific column
		String Bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println("Book Namr :"+Bookname);
		
		//read the data all the row and column
		
		/*for(int r=2;r<=rows;r++) {
			for(int c=1;c<=column;c++) {
				String tbledata=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(tbledata+"\t");
			}
			System.out.println();
		}*/
		
		//Total price 
		
		int total=0;
				for(int r=2;r<=rows;r++) {
					String Price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
					total=total+Integer.parseInt(Price);
				}
				System.out.println(total);
		driver.close();

	}

}
