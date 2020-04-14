package pageobjectmodel;

import org.testng.annotations.Test;

public class TestExecution extends GoogleSearch{
	
	@Test
	public void verifytextsearch()
	{
		texttosearch(driver);
	}

}
