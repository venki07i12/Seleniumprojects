package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static WebDriver driver;
	public static void main(String[] args) {
		// launch application
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		WebElement src=driver.findElement(By.id("draggable"));
		new Actions(driver).dragAndDropBy(src, 330, 95).perform();
		//new Actions(driver).dragAndDropBy(w, 166, 26).perform();
		WebElement trg = driver.findElement(By.xpath("//div[@id='droppable']"));
		//dragAndDrop(WebElement source, WebElement target)
		new Actions(driver).dragAndDrop(src, trg).perform();
		driver.switchTo().defaultContent();  //----to come out of the frame
		//driver.close();

	}

}
