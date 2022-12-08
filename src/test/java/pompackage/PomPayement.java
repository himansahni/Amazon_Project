package pompackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import BasePackage.BaseClass;

public class PomPayement extends BaseClass  {

	
	@FindBy(xpath="//*[@id=\"a-page\"]/div[2]/div/div[3]/div[2]/a/div/div/div/div[2]/h2") //Payment Module Link
	WebElement Payement;
	
	@FindBy(linkText="Add a payment method") 		//Add Payment Method link
	WebElement Addpayement;
	
	@FindBy(xpath="/html/body/div[1]/div[4]/div/div[2]/div/div/div[2]/div[3]/div/div[2]/div/div/div/div/div[2]/div/div[1]/span/span[1]/span/input") 			// Add Card Link
	WebElement Addcard;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div/input")
	WebElement Cardnumber;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[2]/div[2]/input")
	WebElement Cardname;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[1]/span")
	WebElement CardDate;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[1]/div[2]/div/div[3]/div[2]/div[1]/span[3]/span")
	WebElement CardYear;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div/div/div/div/div[2]/div/div/div/div[1]/form/div[2]/div/span[2]/span/input")
	WebElement AddCardBttn;
	
	public PomPayement()
	{
		PageFactory.initElements(drv, this);
		
		
	}
	
	public void Payement() {
		Payement.click();
	}
	
	public void Addpayement() {
		Addpayement.click();
	}
	
	public void Addcard() {
		Addcard.click();
	}
	
	public void Cardnumber(String Cnum) {
		//drv.switchTo().frame("DAsis");
		Cardnumber.sendKeys(Cnum);
	}
	
	
	public void Cardname(String Cardnam) {
		Cardname.sendKeys(Cardnam);
	}
	
	public void cardDate(String CarDDate) {
		CardDate.click();
		drv.findElement(By.linkText(CarDDate)).click();
	}
	
	public void Cardyear(String CarDMonht) {
		CardYear.click();
		drv.findElement(By.linkText(CarDMonht)).click();;
	}
	
	public void Button() {
		AddCardBttn.click();
	}
}

