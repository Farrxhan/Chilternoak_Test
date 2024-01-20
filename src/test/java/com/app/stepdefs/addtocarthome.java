
package com.app.stepdefs;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.pagefactory.AddToCartPages;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class addtocarthome {

	private static final Logger logger = LogManager.getLogger(addtocarthome.class);
	AddToCartPages pages=new AddToCartPages(MyHooks.driver) ;

	@Given("User navigates to the URL")
	public void user_navigates_to_the_url() {
		logger.info("Navigating to the URL");

	}

	@Then("user search sofa")
	public void user_search_book() throws InterruptedException {
		logger.info("user searches for sofa");

		pages.inputToSearch("sofa");

	}

	@Then("add")
	public void add() throws InterruptedException {
		logger.info("Then adds item to cart");
		Thread.sleep(2000);
		pages.add();


	}


	@Then("remove")
	public void remove() throws InterruptedException {
		logger.info("Then removes item from cart");
		Thread.sleep(3000);
		pages.remove();

	}
	@Then("user search table")
	public void user_search_book1() throws InterruptedException {
		logger.info("user searches for table");

		pages.inputToSearch("table");


	}


}

