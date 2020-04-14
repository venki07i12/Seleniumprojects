package mypackages;



import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserResize {

	public static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver  = new ChromeDriver();
		Dimension d = new Dimension(580,620);
		driver.manage().window().setSize(d);
		driver.get("https://www.google.com/");
		

	}

}
