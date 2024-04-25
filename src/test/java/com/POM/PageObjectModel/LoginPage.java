package com.POM.PageObjectModel;

import org.openqa.selenium.By;
//LoginPage
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver driver) {
		super(driver); //super keyword is used to call the constructor of the parent class from a subclass.
	}

//	@FindBy(id = "email")
//	WebElement sendKeys_emailInput;
//
//	public WebElement enterEmail() {
//		return sendKeys_emailInput;
//	}
//
//	@FindBy(id = "pass")
//	WebElement sendKeys_passwordInput;
//
//	public WebElement enterPassword() {
//		return sendKeys_passwordInput;
//	}
//}
	public WebElement enterEmail() {
        return driver.findElement(By.id("email"));
    }

    public WebElement enterPassword() {
        return driver.findElement(By.id("pass"));
    }
}
