package org.automation.elementrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wishlist {

	@FindBy(xpath="//td[@class='remove-from-cart']//input[@type='checkbox']")
	private List<WebElement> RemoveCheckBox;
	
	@FindBy(xpath="//input[@value='Update wishlist']")
	private WebElement updateWishlist;
	
	@FindBy(xpath="//input[@value='Add to cart']")
	private List<WebElement> addToCart;
	
	@FindBy(linkText="Fiction EX")
	private WebElement fictionproduct;
	
	public Wishlist(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getRemoveCheckBox() {
		return RemoveCheckBox;
	}

	public WebElement getUpdateWishlist() {
		return updateWishlist;
	}

	public List<WebElement> getAddToCart() {
		return addToCart;
	}

	public WebElement getfictionProduct() {
		return fictionproduct;
	}
}
