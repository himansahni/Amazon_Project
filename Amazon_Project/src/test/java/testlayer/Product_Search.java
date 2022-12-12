package testlayer;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
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
	Boolean a1;
	
	@BeforeMethod()
	public void initiatesetup2()
	
	{
		initiation1();
		
		Log1 =new PomLogin();
		Log3 = new PomProduct();
		
	}
	//------------------------------------------------------------------------------------
	@Test(priority=1)
	public void ProductSearch() throws InterruptedException {   // Test to move to next page
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
	Assert.assertEquals(b,"Amazon.ca : book"); // Making sure result are same as searched
	Thread.sleep(5000);
	}
	//----------------------------------------------------------------------
	
	@Test(priority=2)
	public void ProudctSearch_Info() throws InterruptedException {  // Test case to make sure product Info is displayed
		
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
	
	//--------------------------------------------------------------------------------------------
	@Test(priority=3)
	public void Product_Perpage() throws InterruptedException {  // Test to check parts displayed/ page
		
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
	Thread.sleep(5000);
Log3.Button();

String b= Log3.NumProduct();  // To display number of project per page
System.out.println(b);
	}
	
	//----------------------------------------------------------------------------------------------------------
	
	@Test(priority=4)
	public void ProductSearch_Navigating() throws InterruptedException {   // Test to move to next page
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
	Assert.assertEquals(b,"Amazon.ca : book"); // Making sure result are same as searched
	Thread.sleep(5000);

JavascriptExecutor js=(JavascriptExecutor) drv;

js.executeScript("window.scrollBy(0,95000)");  // Code to scroll down
Thread.sleep(5000);
	Log3.SeconndPag();
	Thread.sleep(5000);
	}
	
	//-------------------------------------------------------------------------------------------------
	
	@Test(priority=5)
	public void Product_Pagitation() throws InterruptedException {  // TEst case to check Pagination
	
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
	Thread.sleep(5000);
Log3.Button();
String b= Log3.NumProduct();
System.out.println(b);
String Prodname=Log3.Productname();

System.out.println("Product slected is - "+ Prodname);  // Product name selected to check on next page



	JavascriptExecutor js=(JavascriptExecutor) drv;

	js.executeScript("window.scrollBy(0,40000)");  // Code to scroll down
	Thread.sleep(5000);
		Log3.SeconndPag();      //Moving To page2
		Thread.sleep(5000);
		
		try{
			 a1=drv.findElements(By.linkText(Prodname)).size()>0; // Finding element on page 2 
		}
		catch(NoSuchElementException e)
		{e.printStackTrace();
		
		}
	String a2= a1.toString();
		System.out.print(a1);
		
		Assert.assertEquals(a2,"false");    //to see if same product is found on next screen
		
		
	}
	
	//--------------------------------------------------------------------------------------------	
	
	
	@Test(priority=6)// Test case to add Product to Cart
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
	//-----------------------------------------------------------------------------------------------------
	
	@Test(priority=7)
	public void Product_Sorting() throws InterruptedException {  // Test to check parts displayed/ page
		
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
	Thread.sleep(5000);
Log3.Button();

//Select sort=new Select(drv.findElement(By.id("s-result-sort-select")));
//sort.selectByIndex(2);

Log3.Sort();
Thread.sleep(2000);
Log3.SortBy();
	}
	
	
	
	
	@AfterMethod()
	public void close2() throws InterruptedException {
		Thread.sleep(5000);
		drv.close();}
}
