package facebookPOM;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class FBLoginExecution extends Facebooklogin {

	@Test
	public void login()
	{
		texttologin(driver);
		Reporter.log("Application launched in Firefox broweser");
	}
}
