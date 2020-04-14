package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGannotations{

	@BeforeSuite
	public void bSuite() {
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void bTest() {
		System.out.println("Before Test");
	}
	@BeforeClass
	public void bClass() {
		System.out.println("Before Class");
	}
	@BeforeMethod
	public void bMethod() {
		System.out.println("Before Method");
	}
	@Test (priority=3)
	public void testone() {
		System.out.println("Actual Test One");
	}
	@Test (priority=2)
	public void testTwo() {
		System.out.println("Actual Test Two");
	}
	
	@Test (priority=1)
	public void testThree() {
		System.out.println("Actual Test Three");
	}
	@Test (priority=0)
	public void testfour() {
		System.out.println("Actual Test four");
	}
	
	
	@AfterTest
	public void aTest() {
		System.out.println("After Test");
	}
	@AfterClass
	public void aClass() {
		System.out.println("After Class");
	}
	@AfterSuite
	public void aSuite() {
		System.out.println("After Suite");
	}
	
	@AfterMethod
	public void aMethod() {
		System.out.println("After Method");
	}
}
