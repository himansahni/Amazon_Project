package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BaseClass {

public static Properties prop=new Properties();
public static WebDriver drv;
	


public BaseClass()
{
	
	
	try {
		FileInputStream file= new FileInputStream("C:\\Users\\himan\\eclipse-workspace\\Amazon_Project\\src\\test\\java\\Environment\\Config.properties");
	prop.load(file);
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	catch (IOException a) {
		a.printStackTrace();
	}
	
}
public static void initiation1()	{  // Calling URL to sign in page
	
String browsername= prop.getProperty("browser");

if(browsername.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	drv= new FirefoxDriver();
}
	else if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
		drv= new ChromeDriver();
	}
	
drv.manage().window().maximize();
drv.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
drv.get(prop.getProperty("URL"));

}
	
	
	
public static void initiation2()	{
	
String browsername= prop.getProperty("browser");

if(browsername.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver", "geckodriver.exe");
	drv= new FirefoxDriver();
}
	else if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "chromeDriver.exe");
		drv= new ChromeDriver();
	}
	
drv.manage().window().maximize();
drv.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
drv.get(prop.getProperty("URL2"));

}
	



	
}
	

