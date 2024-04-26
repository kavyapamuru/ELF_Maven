package org.automation.test_Scripts;

import org.automation.elementrepository.BooksPage;
import org.automation.elementrepository.DigitalDownloadsPage;
import org.automation.elementrepository.ShoppingCart;
import org.automation.genericlibrary.BaseTest;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Books01Test extends BaseTest {
 @Test
	public void userIsAbleToClickOnBooksPage()
	{
	 home_Page.getbookLink().click();
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Books","books page is not displayed");
	    Reporter.log("books page is displayed",true);
	    
	    BooksPage books_Page=new BooksPage(driver);
	   String actName= books_Page.getBookName1().getText();
	   books_Page.getBookName1().click();
	    Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Computing and Internet","computing page is not displayed");
	    Reporter.log("computing page is displayed",true);
	    
		DigitalDownloadsPage digital=new DigitalDownloadsPage(driver);
        digital.getAddToCart().click();
        
        home_Page.getShoppingCartLink().click();
		
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Shopping Cart","shopping cart page is not displayed");
		Reporter.log("shopping cart page is displayed",true);
		
		String expName=books_Page.getBookName1().getText();
		Assert.assertEquals(actName, expName,"verifyUserIsAbleToClickOnBooksPage test case fail");
		Reporter.log("verifyUserIsAbleToClickOnBooksPage test case pass",true);
		
		ShoppingCart shopping=new ShoppingCart(driver);
		shopping.getRemoveProductsCheckBoxs().click();
	}
	
}
