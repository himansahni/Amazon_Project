package pompackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;

public class Pomfrontpage extends BaseClass {

	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[2]/div[1]/a/div/div/div/div[2]/div/span") //Your Order
	WebElement Yourorder;

	@FindBy(xpath="//*[@id=\"nav-link-accountList-nav-line-1\"]") // Account button
	WebElement acc;
	
	@FindBy(linkText="Buy Again") // Buy Again Button
	WebElement buyagain;
	
	@FindBy(linkText ="Cancelled Orders") // Canceled Order Button
	WebElement CanceledOrder;
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[1]/a/div/div/div/div[2]/h2") //Address module button
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2") //Payment module button
	WebElement payement;
	
	public Pomfrontpage()
	{
		PageFactory.initElements(drv, this);
		
		
	}
	
	public void Account() {
		acc.click();
	}
	
	public void Orderbutton(){
		Yourorder.click();
		
	}
	
	public void Buyagain() {
		buyagain.click();
	}
	
	public void CanceledOrder() {
		CanceledOrder.click();
	}
	
	public void address() {
		address.click();
	}
	
	public void payement()
	{
		payement.click();
	}
	
	public String verify3() {
	return drv.getTitle();
	
	}
}
