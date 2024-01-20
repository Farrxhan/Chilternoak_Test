package com.app.stepdefs;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.app.pagefactory.Page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
public class FilterStepdefinition {
	
	

	Page page=new Page(MyHooks.driver);
	private static final Logger logger = LogManager.getLogger(FilterStepdefinition.class);
	
	@Given("user navigates to the website chilternoakfurniture.co.uk")
    public void userNavigatesToChilterNOakPage() {
		logger.info("User navigate to product catlog page");
			}
	
	@Given("search the product")
	public void searchTheProduct() throws InterruptedException {
		logger.info("Item searched");
		page.searchProduct();	}
	
	@Given("drag the price element")
	public void dragPriceElement() throws InterruptedException {
		logger.info("Drag item price element");
		page.drahPriceElement();
	}
	
	@Given("choose the color")
	public void chooseColor() throws InterruptedException {
		logger.info("User choose the color of product");
		page.chooseColor();
	}
	
	@Then("added filter successfully")
	public void addedFilterSuccessfully() {
		logger.info("Filter operation performed successfully.");
	}

}





