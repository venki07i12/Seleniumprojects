package mypackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Displaylinks {

	public static WebDriver driver;
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://in.ebay.com/");
	//count of links
	List<WebElement> olinks = driver.findElements(By.tagName("a"));
	//Display no.of links
	System.out.println(olinks.size());
	/*for(WebElement dlink:olinks)
	{
		System.out.println(dlink.getText());
	}*/
	for(int i=0; i<olinks.size();i++)
			{
				System.out.println(olinks.get(i).getText());
			

	}

}
}
