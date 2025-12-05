package SeleniumScript;

import org.testng.annotations.Test;

public class FirstTestNg {
	
	@Test(priority = 2)
	void First() {
		
		System.out.println("First run");
		}
	@Test(priority = 1)
	void Secont() {
		System.out.println("Second run");
	}

}
