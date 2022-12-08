package testlayer;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pompackage.PomLogin;
import pompackage.PomPayement;
import pompackage.PomProduct;
import pompackage.Pomfrontpage;

public class Product_Search extends BaseClass {

	PomLogin Log1;
	
	PomProduct Log3;
	
	
	@BeforeMethod()
	public void initiatesetup2()
	
	{
		initiation1();
		
		Log1 =new PomLogin();
		Log3 = new PomProduct();
		
	}
	
	@Test(priority=1)
	public void ProductSearch_Navigating() throws InterruptedException {
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
	Log3.ProductSearch(prop.getProperty("Productname"));
	Log3.Button();
	String b=Log1.verify();
	System.out.println(b);
	Assert.assertEquals(b,"Amazon.ca : bag"); // Making sure result are same as searched
	Thread.sleep(5000);

JavascriptExecutor js=(JavascriptExecutor) drv;

js.executeScript("window.scrollBy(0,95000)");  // Code to scroll down
Thread.sleep(5000);
	Log3.SeconndPag();
	Thread.sleep(5000);
	}
	
	@Test(priority=2)
	public void ProudctSearch_Info() throws InterruptedException {
		
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
	Log3.ProductSearch(prop.getProperty("Productname"));
	Log3.Button();
	Log3.item();
	String a= Log1.verify();
	System.out.println(a);
	}
	
	
	
	@Test(priority=3)
	public void ProudctSearch_AddCart() throws InterruptedException {
		
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
	Log3.ProductSearch(prop.getProperty("Productname"));
	Log3.Button();
	Log3.item();
	String a= Log1.verify();
	System.out.println(a);
	Log3.addtocart();
	}
	
	@AfterMethod()
	public void close2() throws InterruptedException {
		Thread.sleep(5000);
		drv.close();}
}
