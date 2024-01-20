package com.app.pagefactory;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Checkout1 {

	WebDriver driver;



	@FindBy(id = "TextField9")
	WebElement First_Name;

	@FindBy(id = "TextField10")
	WebElement Last_Name;

	@FindBy(id = "shipping-address1")
	WebElement Address;

	@FindBy(id = "TextField12")
	WebElement City;

	@FindBy(id = "TextField13")
	WebElement PostCode;

	@FindBy(id = "TextField14")
	WebElement Phone;

	@FindBy(xpath = "//button[@type=\"submit\"]")
	WebElement Continue;

	@FindBy(xpath = "//a[@class=\"QT4by eVFmT j6D1f janiy adBMs EP07D\"]")
	WebElement Return;

	public Checkout1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Actions		
	public void Test_Case_2() throws InterruptedException {

		Thread.sleep(3000);
		First_Name.clear();
		First_Name.sendKeys(" ");
		Thread.sleep(2000);

		Last_Name.clear();
		Last_Name.sendKeys("  ");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys("  ");
		Thread.sleep(2000);

		City.clear();
		City.sendKeys("  ");
		Thread.sleep(2000);

		PostCode.clear();
		PostCode.sendKeys("   ");
		Thread.sleep(2000);

		Phone.clear();
		Phone.sendKeys("  ");
		Thread.sleep(2000);

		Continue.click();
		Thread.sleep(6000);
		//Return.click();

	}

	public void Test_Case_3() throws InterruptedException {

		Thread.sleep(3000);
		First_Name.clear();
		First_Name.sendKeys("Ram");
		Thread.sleep(2000);

		Last_Name.clear();
		Last_Name.sendKeys("  ");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys(" ");
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
		//Return.click();

	}

	public void Test_Case_4() throws InterruptedException {

		Thread.sleep(3000);
		First_Name.clear();
		First_Name.sendKeys("Sai");
		Thread.sleep(2000);

		Last_Name.clear();
		Last_Name.sendKeys("Ram");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys(" ");
		Thread.sleep(2000);

		City.clear();
		City.sendKeys("Fareham");
		Thread.sleep(2000);

		PostCode.clear();
		PostCode.sendKeys("PO17 6AD");
		Thread.sleep(2000);

		Phone.clear();
		Phone.sendKeys("+44 777744773@");
		Thread.sleep(2000);

		Continue.click();
		Thread.sleep(6000);
		//Return.click();

	}

	public void Test_Case_5() throws InterruptedException {

		Thread.sleep(3000);
		First_Name.clear();
		First_Name.sendKeys("Ram");
		Thread.sleep(2000);

		Last_Name.clear();
		Last_Name.sendKeys("#1234");
		Thread.sleep(2000);

		Address.clear();
		Address.sendKeys("  ");
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
		//Return.click();

	}
	@FindBy(using="error-for-TextField9",how=How.ID)
	private WebElement first_name_error_message;

	@FindBy(using="error-for-TextField10",how=How.ID)
	private WebElement last_name_error_message;

	@FindBy(using="error-for-TextField14",how=How.ID)
	private WebElement phone_number_error_message;

	String Actual_result="";
	String Expected_Result="";
	public void validateFirstNameMessage() {

		Actual_result=first_name_error_message.getText();
		Expected_Result="Enter a first name";
		assertEquals(Actual_result, Expected_Result);

	}
	public void validateLastNameMessage() {

		Actual_result=last_name_error_message.getText();
		Expected_Result="Enter a last name";
		assertEquals(Actual_result, Expected_Result);

	}

	public void validatePhoneNumber() {

		Actual_result=phone_number_error_message.getText();
		Expected_Result="Enter a valid phone number";
		assertEquals(Actual_result, Expected_Result);

	}

	public void validateWrongLastName() {

		Actual_result=driver.getTitle();
		Expected_Result="Enter a valid phone number";
		assertEquals(Actual_result, Expected_Result);

	}






}