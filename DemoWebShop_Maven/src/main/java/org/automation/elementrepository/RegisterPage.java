package org.automation.elementrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
    @FindBy(id="gender-female")
	private WebElement genderButton;
    
    @FindBy(id="FirstName")
    private WebElement firstName;
    
    @FindBy(id="LastName")
    private WebElement lastName;
    
    @FindBy(name="Email")
    private WebElement  emailTextField;
    
    @FindBy(name="Password")
    private WebElement passwordTextField;
    
    @FindBy(name="ConfirmPassword")
    private WebElement confirmPassordTextField;
    
    @FindBy(id="register-button")
    private WebElement registerButton;
    
    
    public RegisterPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }


	public WebElement getGenderButton() {
		return genderButton;
	}


	public WebElement getFirstName() {
		return firstName;
	}


	public WebElement getLastName() {
		return lastName;
	}


	public WebElement getEmailTextField() {
		return emailTextField;
	}


	public WebElement getPasswordTextField() {
		return passwordTextField;
	}


	public WebElement getConfirmPassordTextField() {
		return confirmPassordTextField;
	}


	public WebElement getRegisterButton() {
		return registerButton;
	}
}
