package com.exemple.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exemple.data.UserData;
import com.exemple.utils.ConfigProperties;

public class LoginPage extends Page {
	
	
	// click cat
	
	@FindBy(xpath = "//*[@id='wrapper']/div/header/div/nav/ul/li[1]/a")
	public WebElement ClickCategoria;
	@FindBy(xpath = "//*[@id='wrapper']/div/header/div/nav/ul/li[1]/div/ul[4]/li/a/span")
	public WebElement ClickPodCategoria;
	
	@FindBy(xpath = "//*[@id='contentRow']/div[2]/div/div[1]/a/img")
	public WebElement ClickGood;
	
	@FindBy(xpath  = "//*[@id='product']/div[1]/div[1]/div[1]/span[2]")
	public WebElement SelectCountGood;
	
	@FindBy(xpath = "//*[@id='option-356']/li[2]/div/button")
	public WebElement ClickSelectSupplierOn;
	
	@FindBy(xpath = "//*[@id='option-356']/li[2]/div/div/ul/li[3]/a/span")
	public WebElement ClickSelectSupplier;
	
	@FindBy(xpath = "//*[@id='option-357']/li[2]/div/button")
	public WebElement ColorType;
	
	@FindBy(xpath  = "//*[@id='option-357']/li[2]/div/div/ul/li[5]/a/span")
	public WebElement TypeTextile;
	
	@FindBy(xpath  = "//*[@id='option-357']/li[2]/div/div/ul/li[5]/a/span")
	public WebElement ColorTextile;
	
	@FindBy(className  = "buyButton")
	public WebElement FieldBotton;
	
	@FindBy(xpath  = "html/body/div[5]/div/div/div[1]/div/div/form/div[2]/div/div[1]/a")
	public WebElement FieldBottonChekout;
	
	// This is input text
	
	@FindBy(id  = "payment_address_firstname")
	public WebElement FieldName;
	
	@FindBy(id  = "payment_address_email")
	public WebElement FieldEmail;
	
	@FindBy(id  = "payment_address_telephone")
	public WebElement FieldPhone;
	
	@FindBy(id  = "payment_address_address_1")
	public WebElement FieldAdress;
	
	@FindBy(id  = "payment_address_city")
	public WebElement FieldCity;
	
	
	// This click Delivery and pay
	
	@FindBy(xpath  = "//*[@id='shipping_method_wrap']/div/div[2]/div[2]/div/button")
	public WebElement FieldDeliveryOn;
	@FindBy(xpath  = "//*[@id='shipping_method_wrap']/div/div[2]/div[2]/div/div/ul/li[2]/a/span")
	public WebElement FieldDelivery;
	
	@FindBy(xpath  = "//*[@id='payment_method_wrap']/div/div[2]/div[2]/div/button")
	public WebElement FieldPayOn;
	@FindBy(xpath  = "//*[@id='payment_method_wrap']/div/div[2]/div[2]/div/div/ul/li/a/span")
	public WebElement FieldPay;
	// comment
	
	@FindBy(id  = "confirm_comment")
	public WebElement FieldComent;
	
	// button order
	
	@FindBy(xpath= "//*[@id='confirm_order']")
	public WebElement FieldCheckOrder;
	
	@FindBy(xpath = "//*[@id='wrapper']/div/div[2]/div/div/div[1]/div/a")
	public WebElement FieldExit;
	
	@FindBy(xpath = "//*[@id='wrapper']/div/header/div/div[1]/div[2]/div[1]/a/img")
	public WebElement FieldHome;
	
	
	public LoginPage(WebDriver driver) {
		
		super(driver);
	}
	
	public HomePage loginAs(UserData admin) {
		//click page
		
		ClickCategoria.click(); 
		ClickPodCategoria.click(); 
		ClickGood.click();
		SelectCountGood.click(); 
		ClickSelectSupplierOn.click(); 
		ClickSelectSupplier.click(); 
		ColorType.click();
		TypeTextile.click(); 
		FieldBotton.click(); 
		FieldBottonChekout.click();
		
		//input text
		type(FieldName, admin.name);
		type(FieldEmail, admin.email);
		type(FieldPhone, admin.phone);
		type(FieldAdress, admin.adress);
		type(FieldCity, admin.town);
		
		// input delivery 
		FieldDeliveryOn.click();
		FieldDelivery.click();
		
		// input payment
		FieldPayOn.click();
		FieldPay.click();
		
		// input comment
		type(FieldComent, admin.coment);

		//click oder
		FieldCheckOrder.click();
		FieldExit.click();
		
		FieldHome.click();

		return PageFactory.initElements(driver, HomePage.class);
		
	}
    @Override
	public void open(){
		driver.get(ConfigProperties.getProperty("login.url"));
	}

	
		

}
