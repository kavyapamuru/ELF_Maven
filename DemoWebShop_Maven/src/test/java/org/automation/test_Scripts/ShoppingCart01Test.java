
package org.automation.test_Scripts;

import org.automation.elementrepository.DigitalDownloadsPage;
import org.automation.genericlibrary.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ShoppingCart01Test extends BaseTest{
    @Test
	public void verifyUserIsAbleToClickOnShoppingCart()
	{
    	home_Page.getdigitalDownloadsLink().click();
    	Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Digital downloads","digital page is not displayed");
    	Reporter.log("digital page is displayed", true);
    	
		DigitalDownloadsPage digital=new DigitalDownloadsPage(driver);
		digital.getalbumProductName1().click();
		
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Music 2","music page not displayed");
		Reporter.log("music page is displayed",true);
		
		digital.getAddToCart().click();
		home_Page.getShoppingCartLink().click();
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Shopping Cart","shopping cart page not displayed");
		Reporter.log("shopping cart page is displayed",true);
	
	}
}
