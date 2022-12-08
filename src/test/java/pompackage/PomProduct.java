package pompackage;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


import BasePackage.BaseClass;

public class PomProduct extends BaseClass  {


	@FindBy(xpath="/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")
	WebElement ProductSearch;
	
	@FindBy(xpath="//*[@id=\"nav-search-submit-button\"]")
	WebElement Button;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[68]/div/div/span/a[3]")
	WebElement SeconndPage;
	
	@FindBy(partialLinkText="Waterproof Sling Bag")
	WebElement Item;
	
	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	
	public PomProduct() {
		PageFactory.initElements(drv, this);
	}
	
	public void ProductSearch(String a)
	{
		ProductSearch.sendKeys(a);;
	}
	
	public void Button() {
		Button.click();
	}
	
	public void Title() {
		drv.getTitle();
	}
	
	public void SeconndPag() {
		SeconndPage.click();
	}
	
	public void item() {
		Item.click();
	}
	
	public void addtocart() {
		AddtoCart.click();
	}
	
}

