package org.automation.test_Scripts;

import org.automation.elementrepository.DigitalDownloadsPage;
import org.automation.elementrepository.FictionExPage;
import org.automation.elementrepository.Wishlist;
import org.automation.genericlibrary.BaseTest;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Books02Test extends BaseTest {

	@Test
	public void verify_User_Is_Able_To_Click_On_DigitalDownloads() {

		home_Page.getdigitalDownloadsLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Digital downloads", "digital page not displayed");
		Reporter.log("digital page displayed", true);

		DigitalDownloadsPage digital = new DigitalDownloadsPage(driver);
		digital.getalbumProductName1().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Music 2", "music page not displayed");
		Reporter.log("music page displayed", true);

		FictionExPage fiction = new FictionExPage(driver);
		fiction.getAddTowishList().click();

		home_Page.getWishListLink().click();

		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Wishlist", "wishlist page not displayed");
		Reporter.log("wishlist page displayed", true);
		
		Wishlist wishlist=new Wishlist(driver);
		  for(WebElement removeCheckBox :  wishlist.getRemoveCheckBox())
		    {
		    	removeCheckBox.click();
		    }
		      
		    wishlist.getUpdateWishlist().click();

	}
}
