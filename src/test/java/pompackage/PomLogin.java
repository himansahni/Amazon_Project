package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;



public class PomLogin extends BaseClass {

@FindBy(id="ap_email") // EMAIL 
WebElement Username;
	
@FindBy(id="ap_password") // PASSWORD
WebElement password;

@FindBy(id="continue") //Continue button
WebElement Contbtn;

@FindBy(id="auth-error-message-box") //Error Message
WebElement PasswordError;

@FindBy(id="signInSubmit") //Signing Button
WebElement Signbtn;

@FindBy(id="nav-link-accountList-nav-line-1") // Verifying name 
WebElement Verify;

@FindBy(name="rememberMe") //Sign In Box 
WebElement Signchkbox;

public PomLogin()
{
	PageFactory.initElements(drv, this);
}

public void typeUsername(String name){ // Entering Username from Config.
	Username.sendKeys(name);
	
}

public void clickbtn() {   // Clicking on Continue button
	Contbtn.click();
}

public void invalidpass(String invalidpass) { // Entering Wrong Password
	password.sendKeys(invalidpass);
}

public String ErrorMessage() {
	return PasswordError.getText();
}

public void typepassword(String pass){ // Entering Password 
	password.sendKeys(pass);
	
}

public void checkbox() {  // Selecting Keep me signing in box
	
	 Signchkbox.click();
}

public void clickbtn1() { // Click on Sign in button 
	Signbtn.click();
}

public String verify() { // Getting title 
	return drv.getTitle();
}
	public String verify1() { // Checking Account name
		return Verify.getText();
			
	}
}