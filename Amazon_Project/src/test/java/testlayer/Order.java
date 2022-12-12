package testlayer;

import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pompackage.PomLogin;
import pompackage.Pomfrontpage;

public class Order extends BaseClass 

{
Pomfrontpage Log2;


PomLogin Log1;	
	
	
	
	@BeforeMethod(groups="second")
	public void initiatesetup2()
	
	{
		initiation1();
		Log2 = new Pomfrontpage();
		Log1 =new PomLogin();
	}
	
	@Test(priority=1,groups="second")
	public void Account_Orders() throws InterruptedException		// To check Order Module
	{
		Log1.typeUsername(prop.getProperty("username"));			// Login
		Thread.sleep(5000);
		Log1.clickbtn();
		Thread.sleep(5000);
	Log1.typepassword(prop.getProperty("password"));
Thread.sleep(5000);
Log1.checkbox();
Thread.sleep(5000);
		Log1.clickbtn1();
		
		
		Thread.sleep(5000);
		Log2.Account();												//Click on Account button
		Thread.sleep(5000);
		Log2.Orderbutton();											//Click on order button
		System.out.println("Able to see orders");
		
		String actual=Log2.verify3();
		System.out.println(actual);
		Assert.assertEquals(actual,"Your Orders");					//Verifying to we are on Order Module
		
		
		Log2.Buyagain();											//Navigating to Buy Again page
		
	String actual1=Log2.verify3();
	System.out.println(actual1);
	Assert.assertEquals(actual1,"Buy Again");						//Verifying We are on Buy again page
	
	
	Log2.CanceledOrder();											//Navigating to canceled order page
	System.out.println("Able to see the canceled orders");			//Verifying we are on canceled order page
	String actual2=Log2.verify3();
	System.out.println(actual2);
	
	}
	
	@Test(priority=2,groups="second")
	public void Account_Address() throws InterruptedException
	{
		Log1.typeUsername(prop.getProperty("username"));  			// To check Order Module
		Thread.sleep(5000);
		Log1.clickbtn();
		Thread.sleep(5000);
	Log1.typepassword(prop.getProperty("password"));
Thread.sleep(5000);
Log1.checkbox();
Thread.sleep(5000);
		Log1.clickbtn1();
		
		
		Thread.sleep(5000);
		Log2.Account();
		Thread.sleep(5000);
		Log2.address();												//Navigating to address module 
		String actual=Log2.verify3();
		System.out.println(actual);
		Assert.assertEquals(actual,"Your Addresses");				// Verifying we are on address page
		drv.navigate().back();
		Thread.sleep(5000);
	}
	
@AfterMethod(groups="second")
public void close2() {
	drv.close();
}
}
