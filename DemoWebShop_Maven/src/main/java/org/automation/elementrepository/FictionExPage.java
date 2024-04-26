package org.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FictionExPage {

	@FindBy(xpath="//input[@value='Add to wishlist']")
	private WebElement addTowishList;
	
	@FindBy(xpath="//span[@class='price-value-78']")
	private WebElement price;
	
	@FindBy(xpath="//h1[@itemprop='name']")
	private WebElement name;
	
	@FindBy(xpath="//input[@value='Email a friend']")
	private WebElement emailaFriend;
	
	
	public FictionExPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}


	public WebElement getAddTowishList() {
		return addTowishList;
	}


	public WebElement getPrice() {
		return price;
	}


	public WebElement getName() {
		return name;
	}


	public WebElement getEmailaFriend() {
		return emailaFriend;
	}
}
