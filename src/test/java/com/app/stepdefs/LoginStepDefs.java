package com.app.stepdefs;

import static org.testng.Assert.assertEquals;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.pagefactory.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {
	private static final Logger logger = LogManager.getLogger(LoginStepDefs.class);
    LoginPage lp=new LoginPage(MyHooks.driver);
    

    @Given("user navigates to the login page")
    public void userNavigatesToLoginPage() {
    	logger.info("User navigates to the loginpage");
     
    	lp.clickLoginPage();
    }

    @When("user enters {string} and {string}")
    public void userEntersUsernameAndPassword(String username, String password) throws InterruptedException {
    	logger.info("User enters the user name and password");
      
    	lp.enterEmail(username);
    	lp.enterPassword(password);
    }

    @When("clicks the login button")
    public void clicksLoginButton() throws InterruptedException {
    	logger.info("User clicks on the login button");
      
    	lp.clickLoginButton();
       Thread.sleep(50000);
    }

    @Then("Message Should Be Displayed {string}")
    public void messageShouldBeDisplayed(String loginResult) {
    	logger.info("Displayed Message");
    		if(!loginResult.isEmpty())
    		assertEquals(loginResult,lp.getMessage());
    }
        
       
    }

