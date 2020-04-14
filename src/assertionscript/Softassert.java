package assertionscript;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Softassert {


	@Test
	public static void testsoftassert()
	{
		
		SoftAssert asserttion = new SoftAssert(); 
		System.out.println("===========Test started============");
		asserttion.assertEquals(12, 13, "drop down count does not match so please check with Developer,");
		System.out.println("===========Test Ended============");
		asserttion.assertAll();
		
	}

}

//If any validation fails it will continue the rest of the script and once scripts completes then it fails the test.

// it means even if single validation fails script will be failed at last but execution will not stop.
