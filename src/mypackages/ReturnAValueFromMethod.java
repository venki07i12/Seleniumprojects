package mypackages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReturnAValueFromMethod {

	public static WebDriver driver;
	
	public static void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com/");
		
	}
	public static String clickLinks(String nlangauge, String ilanguage) {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		String langstatus;
		if (nlangauge.equals("मराठी")) {
		langstatus ="Clicked on marati";
		}
		else if(nlangauge.equals("తెలుగు")) {
			langstatus="Teluhgu got cliked";
			}
		else {
			langstatus="English got Clcicked";
		}
		driver.findElement(By.linkText(nlangauge)).click();
		driver.findElement(By.linkText(ilanguage)).click();
		return langstatus;
	}
	
	public static void teardown() {
		driver.close();
	}
	
	public static void main(String[] args) {
		setup();
		String lan1=clickLinks("తెలుగు","English");
		String lan2=clickLinks("मराठी","English");
		System.out.println(lan1);
		System.out.println(lan2);
		teardown();

	}

}
