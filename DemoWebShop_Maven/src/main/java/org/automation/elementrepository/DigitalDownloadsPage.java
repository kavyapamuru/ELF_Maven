package org.automation.elementrepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPage {

	@FindBy(xpath="(//input[@value='Add to cart'])[1]")
	private WebElement addToCart;
	
	@FindBy(linkText="3rd Album")
	private WebElement albumProductName;
	
	@FindBy(linkText="Music 2")
	private WebElement albumProductName1;
	
	public DigitalDownloadsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getalbumProductName() {
		return albumProductName;
	}

	public WebElement getalbumProductName1() {
		return albumProductName1;
	}
}


