package org.automation.elementrepository;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    @FindBy(className="ico-register")
	private WebElement registerLink;
    
    @FindBy(linkText="Log in")
	private WebElement loginLink;
    
    @FindBy(linkText="Log out")
    private WebElement logoutLink;
    
    @FindBy(linkText="Books")
    private WebElement bookLink;
    
    @FindBy(linkText="Digital downloads")
    private WebElement digitalDownloadsLink;
    
    @FindBy(xpath="//span[text()='Shopping cart']")
    private WebElement shoppingCartLink;
    
    @FindBy(xpath="//span[text()='Wishlist']")
    private WebElement wishListLink;
    
    @FindBy(linkText="Gift Cards")
    private WebElement GiftCards;
    
    
    //Books and links
    
    public HomePage(WebDriver driver)
    {
    	PageFactory.initElements(driver,this);
    }


	public WebElement getRegisterLink() {
		return registerLink;
	}


	public WebElement getLoginLink() {
		return loginLink;
	}


	public WebElement getShoppingCartLink() {
		return shoppingCartLink;
	}


	public WebElement getWishListLink() {
		return wishListLink;
	}
	
	public WebElement getLogoutLink()
	{
		return logoutLink;
	}
    public WebElement getbookLink()
    {
		return bookLink;
    	
    }
    public WebElement getdigitalDownloadsLink() {
		return digitalDownloadsLink;
	}
public WebElement getGiftCards()
{
	return GiftCards;
	
}
 
	
}
