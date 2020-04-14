package testNG;

import java.awt.image.BufferedImage;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;

public class Barcode {
	
	@Test
	  public void barcodeTest() throws Exception {
		  WebDriver driver;
		  System.setProperty("webdriver.chrome.driver", "chromedriver.exe ");
		  driver=new ChromeDriver();
		  driver.get("https://barcode.tec-it.com/en");
		  driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		  driver.manage().window().maximize();
		  
		  String barcodelink=driver.findElement(By.tagName("img")).getAttribute("src");
		  System.out.println(barcodelink);
		   
		  URL url= new URL(barcodelink);
		   BufferedImage bufferedimage=ImageIO.read(url);
		   
		   //from here we use ZXing, ZXing Java SE Extensions jar files
		   
		   LuminanceSource luminanceSource=new BufferedImageLuminanceSource(bufferedimage);
		   BinaryBitmap binaryBitmap=new BinaryBitmap(new HybridBinarizer(luminanceSource));
		   
		   
		  Result result=new MultiFormatReader().decode(binaryBitmap);
		  System.out.println(result.getText());
	}

}
