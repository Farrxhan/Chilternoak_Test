package com.app.stepdefs;

import static org.junit.Assert.assertFalse;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.pagefactory.Searchpage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Searchsteps {
	Logger logger = LogManager.getLogger(Searchsteps.class);
	
     Searchpage searchPage=new Searchpage(MyHooks.driver);
    
    
    
    @Given("I open the browser and enter the URL")
    public void iOpenTheBrowserAndEnterTheURL() {
    	logger.info("Chilternoak Furniture Homepage");
        
    }

    @When("I enter a  product name as {string} in the search bar")
    public void iEnterAValidProductNameInTheSearchBar(String productName) {
    	logger.info( "entering valid product name");
        searchPage.enterSearchTerm(productName);
       
        
    }

    @When("I click on the search button")
    public void iClickOnTheSearchButton() {
    	logger.info("clicking on search button");
        searchPage.clickSearchButton();
        
    }
    @Then("results should be found for the search term")
    public void resultsShouldBeFoundForTheSearchTerm() {
       
        
        String validProductName = " Sofa ";
 
        boolean resultsFound = searchPage.isResultFound(validProductName);
        
        assertFalse("Results should be found for the search term", resultsFound);
    }

    @Then("no results should be found for the search term")
    public void noResultsShouldBeFoundForTheSearchTerm() {
        
        
        String nonExistentTerm = "perfumes";
       
        boolean resultsFound = searchPage.isResultFound(nonExistentTerm);
      
        assertFalse("No results should be found for the search term", resultsFound);
    }
}
