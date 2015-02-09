package com.exemple.tests;


import static org.testng.Assert.assertTrue;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.exemple.pages.HomePage;
import com.exemple.pages.LoginPage;

public class LoginTest extends BaseTestCase {

	private LoginPage loginPage = PageFactory.initElements(getWebDriver(),LoginPage.class);
	
	private HomePage homepage;
	
	@Test
	public void testLogin() throws Exception {
		
		loginPage.open();
		loginPage.loginAs(admin);
		assertTrue(homepage.isLogIn());
		
		
	}

	

	
}
