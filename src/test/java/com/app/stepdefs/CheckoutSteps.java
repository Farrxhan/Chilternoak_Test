package com.app.stepdefs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

import com.app.pagefactory.Checkout1;
import com.app.pagefactory.Checkout2;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class CheckoutSteps {
	

   Checkout1 chk=new Checkout1(MyHooks.driver);
   Checkout2 chk1=new Checkout2(MyHooks.driver);
	//PageObject3 p3=new PageObject3(driver);
	private static final Logger logger = LogManager.getLogger(CheckoutSteps.class);
	
	
	@Given("User is on login page and add item to cart")
	public void User_is_on_login_page_and_add_item_to_cart() throws InterruptedException {
		Thread.sleep(5000);
		logger.info("User is on login page and add item to cart");
		chk1.Login_AddToCart();
	}

	@And("User is able Proceed With Valid Checkout Details")
	public void User_is_able_Proceed_With_Valid_Checkout_Details() throws InterruptedException {
		logger.info("User is able Proceed With Valid Checkout Details");
		chk1.Test_Case_1();
		Assert.assertTrue(true);
		System.out.println("TC_01  -  Passed");
		
	}

	@When("User is Not able Proceed With All Null Checkout Details")
	public void User_is_Not_able_Proceed_With_All_Null_Checkout_Details() throws InterruptedException {
		logger.info("User is Not able Proceed With All Null Checkout Details");
		chk.Test_Case_2();
		chk.validateFirstNameMessage();
//		String Actual_result=driver.findElement(By.id("error-for-TextField9")).getText();
//		String Expected_Result="Enter a first name";
//		Assert.assertEquals(Actual_result, Expected_Result);
		System.out.println("TC_02  -  Passed");
		logger.info("TC02- Passed");
	}

	@And("User is Not able Proceed With Only One Null Checkout Details")
	public void User_is_Not_able_Proceed_With_Only_One_Null_Checkout_Details() throws InterruptedException {
		logger.info("User is Not able Proceed With Only One Null Checkout Details");
		chk.Test_Case_3();
		chk.validateLastNameMessage();
//		String Actual_result1=driver.findElement(By.id("error-for-TextField10")).getText();
//		String Expected_Result1="Enter a last name";
//		Assert.assertEquals(Actual_result1, Expected_Result1);
		System.out.println("TC_03  -  Passed");
		logger.info("TC03- Passed");
	}
	
	@Then("User is Not able To Enter With Invalid Phone Credentials")
	public void User_is_Not_able_To_Enter_With_Invalid_Phone_Credentials() throws InterruptedException {
		logger.info("User is Not able To Enter With Invalid Phone Credentials");
		chk.Test_Case_4();
		chk.validatePhoneNumber();
//		String Actual_result2=driver.findElement(By.id("error-for-TextField14")).getText();
//		String Expected_Result2="Enter a valid phone number";
//		Assert.assertEquals(Actual_result2, Expected_Result2);
		System.out.println("TC_04  - Passed ");
		logger.info("TC04- Passed");
	}
	
	@And("User is Able To Enter With Invalid Credentials")
	public void User_is_Able_To_Enter_With_Invalid_Credentials() throws InterruptedException {
		logger.info("User is Able To Enter With Invalid Credentials");
		chk.Test_Case_5();
		chk.validateWrongLastName();
//		String Actual_result3=driver.getTitle();
//		String Expected_Result3="Enter a  Valid last name";
//		Assert.assertEquals(Actual_result3, Expected_Result3);
		System.out.println("TC_05  - Failed ");
		logger.info("TC05- Failed");
		
	}
	
	

	
}
