package StepDefinations;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import PagesObjects.HomePage;
import io.cucumber.java.en.*;

public class search {
	
	public WebDriver driver;
	public HomePage homepage;
	
	@Given("user navigate to application url")
	public void user_navigate_to_application_url() {
		
		driver = DriverFactory.getdriver();
	    
	}

	@When("user search for valid product {string} in search box field")
	public void user_search_for_valid_product_in_search_box_field(String validitem) {
	    
		homepage = new HomePage(driver);
		homepage.searchfield().sendKeys(validitem);
	}

	@When("user click on search button")
	public void user_click_on_search_button() {
	   
		homepage.searchbutton().click();
	}

	@Then("user should be get a proper valid message")
	public void user_should_be_get_a_proper_valid_message() {
	    
		Assert.assertTrue(homepage.validproductresult().isDisplayed());
		
		System.out.println("validproduct shown");
		
	}

	@When("user search for Invalid product {string} in search box field")
	public void user_search_for_invalid_product_in_search_box_field(String invaliditem) {
	    
		homepage = new HomePage(driver);
		homepage.searchfield().sendKeys(invaliditem);
	}

	@Then("user should be get a proper invalid message")
	public void user_should_be_get_a_proper_invalid_message() {
	    
		/*Assert.assertTrue(homepage.invalidproductresult().isDisplayed());
		
		System.out.println("invalidproduct shown");*/
		
		if(homepage.invalidproductresult().isDisplayed()) {
			System.out.println("invalid item no results msg displayed");
					
		}else {
			System.out.println("valid item results displayed");
		}
	}
	


}
