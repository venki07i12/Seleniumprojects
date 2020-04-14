package assertionscript;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertscript {

	@Test (priority =1)
	public void test1()
	{
		String str = "venkatesh patel";
		Assert.assertTrue(str.contains("venkat"), "Names are not matching");
	}
	
	@Test (priority =2)
	public void test2()
	{
		Assert.assertTrue(true);
	}
	
	@Test (priority =3)
	public void test3()
	{
		Assert.assertTrue(false);
	}
	
	@Test (priority =4)
	public void test4()
	{
		Assert.assertEquals(12, 13, "drop down count does not match so please check with Developer,");
	}
}
