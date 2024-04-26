package org.automation.test_Scripts;

import java.time.Duration;

import org.automation.elementrepository.HomePage;
import org.automation.elementrepository.RegisterPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterTest {
	@Test
	public void register()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		HomePage home_Page = new HomePage(driver);
		home_Page.getRegisterLink().click();
		RegisterPage rp = new RegisterPage(driver);
		rp.getGenderButton().click();
		rp.getFirstName().sendKeys("kavya");
		rp.getLastName().sendKeys("pamuru");
		rp.getEmailTextField().sendKeys("kavya123456@gmail.com");
		rp.getPasswordTextField().sendKeys("abc123");
		rp.getConfirmPassordTextField().sendKeys("abc123");
		rp.getRegisterButton().click();
		home_Page.getLogoutLink().click();
	}

}
