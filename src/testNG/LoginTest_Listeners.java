package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest_Listeners {

	
		@Test
		public static void loginbyEmail()
		{
			System.out.println("Login by Email");
			Assert.assertEquals("venki07i12", "venki07i12"); //true
		}
		
		@Test
		void loginbyfacebook()
		{
			System.out.println("Login by facebook");
			Assert.assertEquals("venki07i12", "9553440104"); //false
		}

		

	

}
