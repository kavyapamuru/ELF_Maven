package org.automation.test_Scripts;

import org.automation.elementrepository.DigitalDownloadsPage;
import org.automation.elementrepository.ShoppingCart;
import org.automation.genericlibrary.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HomePage01Test extends BaseTest{
    @Test
	public void verifyUserIsAbleToClickOnLinks()
	{
		home_Page.getdigitalDownloadsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads","digital downloads page not displayed");
		Reporter.log("digital downloads page displayed",true);
		
		DigitalDownloadsPage digital=new DigitalDownloadsPage(driver);
		String actName=digital.getalbumProductName().getText();
		digital.getalbumProductName().click();
		
		Assert.assertEquals( driver.getTitle(), "Demo Web Shop. 3rd Album","album page not displayed");
		Reporter.log("album page is displayed",true);
		
 		
		digital.getAddToCart().click();
 		
	    home_Page.getShoppingCartLink().click();
		
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Shopping Cart","shopping cart page is not displayed");
		Reporter.log("shopping cart page is displayed",true);
		
		String expName=digital.getalbumProductName().getText();
		Assert.assertEquals(actName, expName,"verifyUserIsAbleToClickOnLinks test case fail");
		Reporter.log("verifyUserIsAbleToClickOnLinks test case pass",true);
		
		ShoppingCart shopping=new ShoppingCart(driver);
		shopping.getRemoveProductsCheckBoxs().click();
		
 
	}
}
