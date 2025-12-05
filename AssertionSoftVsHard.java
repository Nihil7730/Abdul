package TestNGs;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionSoftVsHard {
	
	@Test
	void SoftAssertion() {
		SoftAssert soft=new SoftAssert();
		soft.assertEquals("a", "b");
		
		System.out.println("Assertion got failed");
		soft.assertAll();
	}
	
	@Test
	void HardAssertion() {
		System.out.println("entered Hard assertion");
		Assert.assertEquals("hello", "hello");
		
		System.out.println("Hard assertion completed");
	}

}
