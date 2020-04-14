package javascriptexecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Scrollpage {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		 
		  driver.manage().window().maximize();
		 	 
		  driver.get("http://jqueryui.com");
		  
		  Thread.sleep(5000);
		  
		  JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 // This  will scroll page 400 pixel vertical
		  js.executeScript("scroll(0,400)");
		
		 //js.executeScript("scrollBy(0,400)");
	}

}
