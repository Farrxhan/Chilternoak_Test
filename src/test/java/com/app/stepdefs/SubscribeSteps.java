package com.app.stepdefs;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;

import com.app.pagefactory.SubscribePage;
import com.app.utils.ExcelReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class SubscribeSteps {
	private static final Logger logger = LogManager.getLogger(SubscribeSteps.class);

	
	SubscribePage subscribePage=new SubscribePage(MyHooks.driver);
	//SubscribeSteps subscribeSteps=new SubscribeSteps();
	
	@Given("user in homepage")
	public void user_in_homepage() {
		logger.info("user in homepage");
		
		
	}

	@When("user click Subscribe email text box")
	public void user_click_subscribe_email_text_box() {
		logger.info("user click Subscribe email text box");
		subscribePage.clickEmailTextBox();
	}

	@When("user fills the details from given sheetname {string} and rownumber {int}")
	public void user_fills_the_details_from_given_sheetname_and_rownumber(String sheetName, int rowNumber ) throws IOException, InterruptedException {
		
		logger.info("user fills the details from given sheetname {string} and rownumber {int}");
		
			
			String email=ExcelReader.getData(rowNumber, sheetName);
			Thread.sleep(3000);
			subscribePage.enterEmail(email);
			Thread.sleep(2000);
		
	}

	@When("user clicks on subscribe button")
	public void user_clicks_on_subscribe_button() throws InterruptedException {
		logger.info("user clicks on subscribe button");
		try {
			subscribePage.clickSubscribeBtn();
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			Assert.fail("please enter valid data for subscribe");
		}
	}

	@Then("it shows sucess message {string}")
	public void it_shows_sucess_message(String loginResult ) {
		logger.info("it shows sucess message {string}");
		
		String expected=loginResult;
		String actual=subscribePage.validate_Confirmation_Text();
		actual.equals(loginResult); 
		Assert.assertFalse(actual.contains(expected));
		//Assert.assertFalse(driver.findElement(By.xpath("(//p['Receive all of the latest information on Events, Sales and Offers. Sign up for our newsletter today.'])[9]))").;
		
		//Assert.assertTrue(driver.findElement(By.xpath("//h4[@class='no-margin']")).isDisplayed();
	}
}
