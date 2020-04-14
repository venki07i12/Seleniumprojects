package modulardrivenframework;

import org.testng.annotations.Test;

public class TestcaseExecution extends Repository{
	
	@Test
	public void verifylogin()
	{
		setup();
		login();
	}
	

}
