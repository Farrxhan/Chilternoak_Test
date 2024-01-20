package com.app.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Checkout2 {

	WebDriver driver;
	////input[@name='lastName' and  @aria-required='true']
	@FindBy(xpath = "//a[@class='toolbar-account']")
	WebElement Login;

	@FindBy(xpath = "//input[@id='customer_email']")
	WebElement Email;

	@FindBy(xpath = "//input[@type='password']")
	WebElement Password;

	@FindBy(xpath = "//input[@type='submit']")
	WebElement Login_Btn;

	@FindBy(xpath = "//input[@class=\"main-search__input\"]")
	WebElement Search;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Search_Submit;

	@FindBy(xpath = "//button[@name='add'][1]")
	WebElement Cart;

	@FindBy(linkText = "Checkout")
	WebElement Chk1;

	@FindBy(xpath = "//button[@class=\"checkout-button checkout-button--lower\"]")
	WebElement Chk2;

	@FindBy(id = "TextField1")
	WebElement First_Name;

	@FindBy(id = "TextField2")
	WebElement Last_Name;

	@FindBy(id = "shipping-address1")
	WebElement Address;

	@FindBy(id = "TextField7")
	WebElement City;

	@FindBy(id = "TextField8")
	WebElement PostCode;

	@FindBy(id = "TextField6")
	WebElement Phone;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Continue;
	
	@FindBy(xpath = "//a[@class=\"QT4by eVFmT j6D1f janiy adBMs EP07D\"]")
	WebElement Return;

	public Checkout2(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions

	public void Login_AddToCart() throws InterruptedException {

		Login.click();
		Thread.sleep(2000);
		Email.sendKeys("usera@gmail.com");
		Thread.sleep(2000);
		Password.sendKeys("User@123");
		Thread.sleep(2000);
		Login_Btn.click();
		Thread.sleep(100000);
		Search.sendKeys("Sofa");
		Search_Submit.click();
		Thread.sleep(2000);
		Cart.click();
		Chk1.click();
		Chk2.click();
	}
	
	
	
	public void Test_Case_1() throws InterruptedException {

		First_Name.clear();
		First_Name.sendKeys("Pankaj");
		Thread.sleep(2000);
	
		Last_Name.clear();
		Last_Name.sendKeys("Tripathi");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys("Dstl Portsdown West");
		Thread.sleep(2000);

		City.clear();
		City.sendKeys("Fareham");
		Thread.sleep(2000);

		PostCode.clear();
		PostCode.sendKeys("PO17 6AD");
		Thread.sleep(2000);

		Phone.clear();
		Phone.sendKeys("+44 7777447731");
		Thread.sleep(2000);

		Continue.click();
		Thread.sleep(6000);
		Return.click();
		
	}
	
	public void Test_Case_2() throws InterruptedException {
		
		Thread.sleep(3000);
		First_Name.clear();
		First_Name.sendKeys(" ");
		Thread.sleep(2000);
	
		Last_Name.clear();
		Last_Name.sendKeys("Tripathi");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys("Dstl Portsdown West");
		Thread.sleep(2000);

		City.clear();
		City.sendKeys("Fareham");
		Thread.sleep(2000);

		PostCode.clear();
		PostCode.sendKeys("PO17 6AD");
		Thread.sleep(2000);

		Phone.clear();
		Phone.sendKeys("+44 7777447731");
		Thread.sleep(2000);

		Continue.click();
		Thread.sleep(6000);
		Return.click();
		
	}



}