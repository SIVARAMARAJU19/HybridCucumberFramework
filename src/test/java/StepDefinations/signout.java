package StepDefinations;


import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import PagesObjects.CustomerloginPage;
import PagesObjects.HomePage;
import PagesObjects.myAccountHomepage;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class signout {

	public WebDriver driver;
	public myAccountHomepage myaccounthomepage;
	public HomePage homepage;


	@Given("User has navigate to  Account Homepage")
	public void user_has_navigate_to_account_homepage() {

		driver = DriverFactory.getdriver();
		homepage = new HomePage(driver);
		homepage.signinoption().click();

		CustomerloginPage customerloginpage = new CustomerloginPage(driver);
		customerloginpage.emailField().sendKeys("minnieakki1919@gmail.com");
		customerloginpage.passwordfield().sendKeys("password@19");
		customerloginpage.signinbutton().click();

		System.out.println("signin sucess");
	}

	@When("User has click on Account dropdown")
	public void user_has_click_on_account_dropdown() {

		myaccounthomepage = new myAccountHomepage(driver);
		myaccounthomepage.dropdownbutton().click();

	}


	@When("click signout option")
	public void click_signout_option() {

		myaccounthomepage.signoutoption().click();


	}

	@Then("User should be sucessfully signedout")
	public void user_should_be_sucessfully_signedout() {

		if(homepage.signinoption().isDisplayed()) {

			System.out.println("signedout sucessfully");
		}else {

			System.out.println("signedout failure");
		}

	}

	@When("User has close the browser")
	public void user_has_close_the_browser() {

		System.out.println("Application close");
	}

	@When("User has reopen site link")
	public void user_has_reopen_site_link() {

		driver.get("https://magento.softwaretestingboard.com/");

		System.out.println("site link reopen");
	}

	@Then("User should be in a Account Homepage")
	public void user_should_be_in_a_account_homepage() {

		myaccounthomepage = new myAccountHomepage(driver);
		if(myaccounthomepage.dropdownbutton().isDisplayed()){

			System.out.println("Accountpage displyed");
		}else {

			System.out.println("Accountpage not displyed");
		}





	}
}
