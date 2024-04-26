package org.automation.elementrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCart {
	
    @FindBy(xpath="//td[@class='remove-from-cart']//input[@type='checkbox']")
	private List<WebElement> allCartProduct;
	
	@FindBy(xpath="//input[@name='updatecart']")
    private WebElement updateCartButton;
	
	@FindBy(xpath="//td[@class='remove-from-cart']//input[@type='checkbox']")
	private WebElement removeProductsCheckBoxs;
	
	 
	
	public ShoppingCart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public List<WebElement> getRemoveFromCart() {
		return allCartProduct;
	}

	public WebElement getUpdateCart() {
		return getUpdateCart();
	}

	public WebElement getRemoveProductsCheckBoxs() {
		return removeProductsCheckBoxs;
	}

	 
}
