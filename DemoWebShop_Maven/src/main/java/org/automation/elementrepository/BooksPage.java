package org.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BooksPage {

	@FindBy(linkText="Fiction EX")
	private WebElement bookName;
	
	@FindBy(xpath="//input[@class='button-1 add-to-cart-button']")
	private WebElement addToCart ;
	 
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailaFriend;
	
	@FindBy(xpath="//input[@value='Add to compare list']")
	private WebElement addToCampareList;
	
	@FindBy(linkText="Computing and Internet")
	private WebElement bookName1;
	
	public BooksPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getBookName() {
		return bookName;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getEmailaFriend() {
		return emailaFriend;
	}

	public WebElement getAddToCampareList() {
		return addToCampareList;
	}
	public WebElement getBookName1()
	{
		return  bookName1;
		
	}
}
