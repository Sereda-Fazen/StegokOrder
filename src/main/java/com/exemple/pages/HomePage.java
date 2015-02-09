package com.exemple.pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Page {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(linkText = "Продолжить")
	public WebElement home;
	
	public boolean isLogIn() {
		if (isElementPresent(home)) {
		return true;
		}
		else
			return false;
	}
	
	
	@Override
	public void open() {
		
	}
	
	public boolean home() {
		home.click();
		return false;
	}
	
}
	


