package testlayer;

import org.testng.Assert;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import pompackage.PomLogin;
import pompackage.Pomfrontpage;

public class LoginTest  extends BaseClass{

	PomLogin Log1;
	Pomfrontpage Log2;
	public LoginTest() {
		
		super();
	}
	
	
	@BeforeMethod(groups="first")  // Calling initial Setups
	public void initatesetup() {
		initiation1(); 				// Calling function from base class to go to specific URl

		Log1 =new PomLogin();
		Log2 = new Pomfrontpage();
	}
	
	
	@Test(priority=1, groups="first") // Test case to check we are on SignIn page
	public void Title()
	{
		String actual=Log1.verify();
		System.out.println(actual);
		Assert.assertEquals(actual, "Amazon Sign In");
	
	}
	
	@Test(priority=2, groups="first") 		// Test case to check with wrong password
	public void InvalidPassword() throws InterruptedException {
		Log1.typeUsername(prop.getProperty("username"));
		Thread.sleep(5000);
		Log1.clickbtn();
		Thread.sleep(5000);
	Log1.typepassword(prop.getProperty("invalidpassword")); // Using invalid password
Thread.sleep(5000);
Log1.checkbox();
Thread.sleep(5000);
		Log1.clickbtn1();
Thread.sleep(5000);
String actual=Log1.ErrorMessage();

System.out.println(actual);
Assert.assertEquals(actual,"There was a problem\r\n"
		+ "Your password is incorrect");

		
	}
	
	@Test(priority=3, groups="first") 		// Test case to check if we are able to login and can see customer name
	public void Login() throws InterruptedException {
		Log1.typeUsername(prop.getProperty("username"));
		Thread.sleep(5000);
		Log1.clickbtn();
		Thread.sleep(5000);
	Log1.typepassword(prop.getProperty("password"));
Thread.sleep(5000);
Log1.checkbox();
Thread.sleep(5000);
		Log1.clickbtn1();
		Thread.sleep(5000);
		String actual=Log1.verify1();
		System.out.println(actual);
		Assert.assertEquals(actual, "Hello, Himanshu");
		
	}
		
	@AfterMethod()
	public void close() {
		
		drv.close();
	
		
	}
	
	
	
	
	

	
}


