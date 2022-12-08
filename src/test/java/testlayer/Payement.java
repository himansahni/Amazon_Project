package testlayer;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pompackage.PomLogin;
import pompackage.PomPayement;
import pompackage.Pomfrontpage;

public class Payement extends BaseClass {

	
	PomLogin Log1;
	Pomfrontpage Log2;
	PomPayement Log3;
	
	@BeforeMethod(groups="second")
	public void initiatesetup2()
	
	{
		initiation1();
		Log2 = new Pomfrontpage();
		Log1 =new PomLogin();
		Log3= new PomPayement();
	}
	
	
	@Test()
	public void payment_module() throws InterruptedException {
		
		Log1.typeUsername(prop.getProperty("username"));			// Login
		Thread.sleep(2000);
		Log1.clickbtn();
		Thread.sleep(2000);
	Log1.typepassword(prop.getProperty("password"));
Thread.sleep(2000);
Log1.checkbox();
Thread.sleep(2000);
		Log1.clickbtn1();
		
		
		Thread.sleep(2000);
		Log2.Account();												//Click on Account button
		Thread.sleep(2000);
		
		Log3.Payement();											//navigating to Payment Module
		Thread.sleep(2000);
		
		Log3.Addpayement();
		Thread.sleep(2000);
		Log3.Addcard();
		Thread.sleep(2000);
		
		
		System.out.println(drv.findElements(By.tagName("iframe")).size());
		/*Alert alert= drv.switchTo().alert();
		System.out.println(alert.getText());*/
		drv.switchTo().frame(1);
		System.out.println(drv.getTitle());
		Thread.sleep(2000);
		//drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div/input")).sendKeys("Cardnum");
		//String a= drv.findElement(By.id("a-popover-header-1")).getText();
		//System.out.println(a);
		Log3.Cardnumber(prop.getProperty("Cardnumr"));
		Log3.Cardname(prop.getProperty("Cardnam"));
		//drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span/span/span")).click();
		//drv.findElement(By.xpath("/html/body/div[5]/div/div/ul/li[7]/a")).click();
		//Select a= new Select(drv.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span/span/span")));
		//a.selectByVisibleText("05");
		Log3.cardDate(prop.getProperty("Card_Date"));
		Log3.Cardyear(prop.getProperty("Card_Year"));
		Thread.sleep(5000);
		Log3.Button();
		
	
	}
	@AfterMethod(groups="second")
	public void close2() {
		drv.close();
	}
	
	
}
