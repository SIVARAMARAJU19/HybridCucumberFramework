package StepDefinations;



import java.util.Date;

import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import PagesObjects.CustomerloginPage;
import PagesObjects.HomePage;
import PagesObjects.myAccountHomepage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class signin {

	public WebDriver driver;
	public CustomerloginPage customerloginpage;

	@Given("User has navigate to Customer Loginpage")
	public void user_has_navigate_to_customer_loginpage() {

		driver = DriverFactory.getdriver();
		HomePage homepage = new HomePage(driver);
		homepage.signinoption().click();

	}

	@When("User has Enter Valid email in email field")
	public void user_has_enter_valid_email_in_email_field() {

		customerloginpage = new CustomerloginPage(driver);
		customerloginpage.emailField().sendKeys("minnieakki1919@gmail.com");
	}

	@And("User has Enter Valid password in password field")
	public void user_has_enter_valid_password_in_password_field() {


		customerloginpage.passwordfield().sendKeys("password@19");
	}


	@And("User has click on signin button")
	public void user_has_click_on_signin_button() {

		customerloginpage.signinbutton().click();
	}

	@Then("User has sucessfully signed in message displyed")
	public void user_has_sucessfully_signed_in_message_displyed() {

		myAccountHomepage myaccounthomepage = new myAccountHomepage(driver);

		if(myaccounthomepage.signinsucessmsg().isDisplayed()) {

			System.out.println("signin sucessfully");
		}else {

			System.out.println("signin not sucessfully");
		}

	}

	@When("User has Enter InValid email in email field")
	public void user_has_enter_in_valid_email_in_email_field() {

		customerloginpage = new CustomerloginPage(driver);
		customerloginpage.emailField().sendKeys(generateemailwithtimestamp());

	}

	@And("User has Enter InValid password in password field")
	public void user_has_enter_in_valid_password_in_password_field() {

		customerloginpage.passwordfield().sendKeys("password@1009");
	}

	@Then("User has should be get proper message about mismatch credentials")
	public void user_has_should_be_get_proper_message_about_mismatch_credentials() {

		customerloginpage = new CustomerloginPage(driver);

		if(customerloginpage.mismatchwarningmsg().isDisplayed()) {

			System.out.println("The account sign-in was incorrect or your account is disabled temporarily. Please wait and try again later");

		}else {

			System.out.println("No mismatchtextmsg displyed");
		}


	}

	@When("User has  dont Enter  email in email field")
	public void user_has_dont_enter_email_in_email_field() {

		customerloginpage = new CustomerloginPage(driver);
		customerloginpage.emailField().sendKeys("");

	}

	@And("User has  dont Enter password in password field")
	public void user_has_dont_enter_password_in_password_field() {

		customerloginpage.passwordfield().sendKeys("");
	}

	@Then("User has should be get proper message about email and password error")
	public void user_has_should_be_get_proper_message_about_email_and_password_error() {

		customerloginpage = new CustomerloginPage(driver);
		

		if(customerloginpage.emailerrormsg().isDisplayed()) {

			System.out.println("emailerrormsg");
		}else {

			System.out.println("no emailerrormsg");
		}

		if(customerloginpage.passworderrormsg().isDisplayed()) {

			System.out.println("passworderrormsg");
		}else {

			System.out.println("no passworderrormsg");
		}
	}


	public static String generateemailwithtimestamp() { 

		Date date=new Date(0); 
		String timpstamp=date.toString().replace(" ","-").replace(":", "-"); 
		return "minnieakki1919"+timpstamp+"@gmail.com"; 

	} 

}
