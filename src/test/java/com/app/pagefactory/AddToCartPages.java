



package com.app.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPages {

	private final WebDriver driver;

	@FindBy(xpath="//input[@class='main-search__input']")
	private WebElement Input;


	
	
	@FindBy(xpath="//input[@name='q']")
	private WebElement search;
	

	
	@FindBy(xpath="//button[@class='btn product-add']")
	private WebElement addtocartbutton;
	
	
	
	
	
	@FindBy(xpath="//button[@class=\"qty-adjuster__down\"]")
	private WebElement removefromcartbutton;

	@FindBy(xpath="//button[@fdprocessedid='104bzk']")
	private WebElement addtocart;

	
	

	public AddToCartPages(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void navigateToURL(String url) {
		driver.get(url);
	}
	public void inputToSearch(String value) {
		Input.sendKeys(value);
		search.click();
	}

	public void add() {
		addtocartbutton.click();
	}

	
	
	public void remove() {
		removefromcartbutton.click();
		
		
		
	}

	public void inputToSearch1(String value) {
		Input.sendKeys(value);
		search.click();
	}
	

}
