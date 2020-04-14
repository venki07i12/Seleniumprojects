package datadrivenframework;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import jxl.Sheet;
import jxl.Workbook;

public class DDT {
	// Create the object
	public static WebDriver driver;

	// launch the Application
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	public void registration() throws Exception {
		// creating object for file class to open xls file
		FileInputStream fis = new FileInputStream("D:\\Selenium Testing\\MindQ\\Notes\\DDT\\writableSheet11.xls");
		// creating an object for workbook
		Workbook w = Workbook.getWorkbook(fis);
		// reading the sheet in the workbook
		Sheet s = w.getSheet("sample1");
		// create a loop to read the rows in excel file
		for (int i = 1; i < s.getRows(); i++) {
			driver.get("http://newtours.demoaut.com/");
			driver.findElement(By.linkText("REGISTER")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("firstName")).sendKeys(s.getCell(0, i).getContents());
			driver.findElement(By.name("lastName")).sendKeys(s.getCell(1, i).getContents());
			driver.findElement(By.name("phone")).sendKeys(s.getCell(2, i).getContents());
			driver.findElement(By.id("userName")).sendKeys(s.getCell(3, i).getContents());
			driver.findElement(By.name("address1")).sendKeys(s.getCell(4, i).getContents());
			driver.findElement(By.name("city")).sendKeys(s.getCell(5, i).getContents());
			driver.findElement(By.name("state")).sendKeys(s.getCell(6, i).getContents());
			driver.findElement(By.name("postalCode")).sendKeys(s.getCell(7, i).getContents());
			// Select select = new
			// Select(driver.findElement(By.name("country")));
			driver.findElement(By.name("country")).sendKeys(s.getCell(8, i).getContents());
			driver.findElement(By.name("email")).sendKeys(s.getCell(9, i).getContents());
			driver.findElement(By.name("password")).sendKeys(s.getCell(10, i).getContents());
			driver.findElement(By.name("confirmPassword")).sendKeys(s.getCell(11, i).getContents());
			driver.findElement(By.name("register")).click();
			Thread.sleep(5000);

		}
	}

	public void tearDown() {
		driver.quit();
	}
	public static void main(String[] args) throws Exception {
		DDT m = new DDT();
		m.setUp();
		m.registration();
		m.tearDown();

	}

}