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
	
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div") // to check number of product displayed on page
	WebElement NumProduct;
	
	@FindBy(linkText="Next")
	WebElement SeconndPage;
	
	@FindBy(partialLinkText="Coloring Book")
	WebElement Item;
	
	@FindBy(id="add-to-cart-button")
	WebElement AddtoCart;
	
	@FindBy(xpath="/html/body/div[1]/div[2]/span/div/h1/div/div[2]/div/div/form/span/span/span/span")
	WebElement Sort;
	
	@FindBy(linkText="Price: High to low")
	WebElement SortBy;
	
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
	
	public String NumProduct() {
		return(NumProduct.getText().split(" ")[0]);
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
	
  public String Productname() {    // To Get name of product
	  return(Item.getText());
  }
  
  public void Sort() {
	  Sort.click();
  }
	
  public void SortBy() {
	  SortBy.click();
  }
}

