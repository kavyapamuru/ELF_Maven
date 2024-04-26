package org.automation.test_Scripts;

import org.automation.elementrepository.BooksPage;

import org.automation.elementrepository.FictionExPage;
import org.automation.elementrepository.Wishlist;
import org.automation.genericlibrary.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class WishListTestCase01Test extends BaseTest{
@Test
	public void verify_User_Is_Able_To_Add_Product_To_WishList()
	{
		home_Page.getbookLink().click();
		Assert.assertEquals( driver.getTitle(),"Demo Web Shop. Books","books page is not displayed");
	    Reporter.log("books page is displayed",true);
	    
	    BooksPage book_Page=new BooksPage(driver);
	    String actProductName=book_Page.getBookName().getText();
	    book_Page.getBookName().click();
	    
	    Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Fiction EX","fiction page not displayed" );
	    Reporter.log( "fiction page is  displayed", true);
	    
	    FictionExPage fiction=new FictionExPage(driver);
	    fiction.getAddTowishList().click();
	    
	    home_Page.getWishListLink().click();
	    Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist","wishlist page not displayed");
	    Reporter.log("wishlist page displayed", true);
	    
	    Wishlist wishlist=new Wishlist(driver);
	   String expProductName=wishlist.getfictionProduct().getText();
	   
	   Assert.assertEquals(actProductName, expProductName,"verify_User_Is_Able_To_Add_Product_To_WishList test case fail");
	    Reporter.log("verify_User_Is_Able_To_Add_Product_To_WishList test case pass", true);
 	    
	    for(WebElement removeCheckBox :  wishlist.getRemoveCheckBox())
	    {
	    	removeCheckBox.click();
	    }
	      
	    wishlist.getUpdateWishlist().click();
	}
}
