package javascriptexecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBLogin {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.manage().window().maximize();

		//Create Object for Java Script executor
		JavascriptExecutor js=((JavascriptExecutor)driver);
		Thread.sleep(2000);
		//TextBox
		js.executeScript("document.getElementById('u_0_m').value='Testing';");
		js.executeScript("document.getElementById('u_0_o').value='Testing';");
		Thread.sleep(2000);
		WebElement mob=driver.findElement(By.xpath("//input[@id='u_0_r']"));
		js.executeScript("arguments[0].value='7860224241';",mob );
		Thread.sleep(2000);
		WebElement pwd=driver.findElement(By.cssSelector("#u_0_w"));
		js.executeScript("arguments[0].value='mindq@1234';",pwd);
		Thread.sleep(2000);
		//DropDown
		js.executeScript("document.getElementById('day').value='26';");
		js.executeScript("document.getElementById('month').value='7';");
		js.executeScript("document.getElementById('year').value='2001';");
		Thread.sleep(2000);
		//Button
		WebElement sign=driver.findElement(By.cssSelector("#u_0_13"));
		js.executeScript("arguments[0].click();",sign);
		Thread.sleep(2000);
		//Links
		WebElement forgot=driver.findElement(By.xpath("//a[contains(.,'Forgotten account?')]"));
		js.executeScript("arguments[0].click();",forgot);
		
		
	}

}
