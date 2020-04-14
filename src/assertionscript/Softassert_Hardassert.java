package assertionscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert_Hardassert {


	@Test (priority=1)
	public static void testsoftassert()
	{
		
		SoftAssert asserttion = new SoftAssert(); 
		System.out.println("===========Test case1 started============");
		asserttion.assertEquals(12, 13, "drop down count does not match so please check with Developer,");
		System.out.println("===========Test case 1 Ended============");
		asserttion.assertAll();
		
	}
	
	@Test (priority=2)
	public static void testhardassert()
	{
		
		System.out.println("===========Test case 2 started============");
		Assert.assertEquals(12, 13, "drop down count does not match so please check with Developer,");
		System.out.println("===========Test case 2 Ended============");
	
		
	}

}

//TestNG Asserts help us to verify the condition of the test in the middle of the test run. 