package objectrepository;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	Properties pro;
	public ConfigReader()
	{
		try {
			File src = new File("./configuration/config.property");
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getchromepath()
	{
		String path = pro.getProperty("chromeDriver");
		return path;
		
	}
	
	public String getApplicationurl()
	{
		String urlpath = pro.getProperty("URL");
		return urlpath;
	}

}
