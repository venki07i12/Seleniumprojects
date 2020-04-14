package mypackages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingwindow {

	public static WebDriver driver;
		public static void main(String[] args) throws InterruptedException {
		// launch application
			
			driver = new ChromeDriver();
			System.setProperty("webdriver.chromedriver.driver", "chromedriver.exe");
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("http://www.popuptest.com/goodpopups.html");
			driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
			Thread.sleep(3000);
			
			Set<String> handler = driver.getWindowHandles();
			Iterator<String> it = handler.iterator();
			
			String parentwindowid = it.next();
			System.out.println("Paraent ID:" +parentwindowid);
			
			String childwindowid = it.next();
			System.out.println("Child ID:" +childwindowid);
			
			driver.switchTo().window(childwindowid);
			Thread.sleep(3000);
			System.out.println("Childwindow popup" +driver.getTitle());
			driver.close();
			
			
			driver.switchTo().window(parentwindowid);
			Thread.sleep(3000);
			System.out.println("Parentwindo popup" +driver.getTitle());
			
			
	}

}
