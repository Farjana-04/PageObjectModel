package com.POM.PageObjectModel;

import org.testng.annotations.Test;

public class TestPage extends DriverPage {

	@Test
	public void first_test() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.enterEmail().sendKeys("2148569083");
	}	
    @Test
    public void second_test() {
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.enterPassword().sendKeys("Tester000@");

		
	}

}