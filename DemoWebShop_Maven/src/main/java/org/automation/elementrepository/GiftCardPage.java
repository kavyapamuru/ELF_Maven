package org.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCardPage {

	@FindBy(linkText="Gift Cards")
	private WebElement GiftCardName;
	
	@FindBy(linkText="$5 Virtual Gift Card")
	private WebElement virtualGiftCard;
	
	public GiftCardPage(WebDriver driver)
	{
		PageFactory.initElements( driver,this);
	}

	public WebElement getGiftCardName() {
		return GiftCardName;
	}
		public WebElement getvirtualGiftCard()
		{
			return virtualGiftCard; 

		}
	
}
