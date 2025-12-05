package TestNGs;

import org.testng.annotations.Test;

public class Priority {
	@Test(priority = 2)
	void first() {
		
		System.out.println("The first entered");
		
	}
	@Test(priority = 1)
	void second() {
		
		System.out.println("Execution completed");	
	}

}
