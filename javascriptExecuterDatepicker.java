package SeleniumScript;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class javascriptExecuterDatepicker {
	


	    public static void main(String[] args) {
	        // Set up WebDriver (e.g., ChromeDriver)
	        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
	        WebDriver driver = new ChromeDriver();
	        
	        try {
	            // Navigate to the desired webpage
	            driver.get("http://example.com"); // Replace with your target URL
	            
	            // Your code to select the date
	            selectCurrentDate(driver);
	        } finally {
	            // Close the browser
	            driver.quit();
	        }
	    }
	    
	    private static void selectCurrentDate(WebDriver driver) {
	        // Use JavaScriptExecutor to set the date
	        JavascriptExecutor js = (JavascriptExecutor) driver;

	        // Get the current date in YYYY-MM-DD format
	        String currentDate = getCurrentDate();

	        // Example: Set the value of an input element with id "datePicker" to the current date
	        js.executeScript("document.getElementById('datePicker').value = arguments[0];", currentDate);
	        System.out.println(currentDate);
	    }
	    
	    private static String getCurrentDate() {
	        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
	        java.util.Date date = new java.util.Date();
	        return sdf.format(date);
	    
	}

}
