package StepDefinations;

import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Factory.DriverFactory;
import PagesObjects.CreateNewAccountPage;
import PagesObjects.CustomerloginPage;
import PagesObjects.HomePage;
import PagesObjects.myAccountHomepage;
import io.cucumber.java.en.*;

public class createanaccount {

	public WebDriver driver;
	public CreateNewAccountPage createnewaccountpage;

	@Given("user has navigate to create new customer account page")
	public void user_has_navigate_to_create_new_customer_account_page() {

		driver = DriverFactory.getdriver();
		HomePage homepage = new HomePage(driver);
		homepage.createaccountoption().click();

	}

	@When("user has entered below 2nd details")
	public void user_has_entered_below_2nd_details(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> datamap = dataTable.asMap(String.class, String.class);

		createnewaccountpage = new CreateNewAccountPage(driver);
		createnewaccountpage.firstnamefield().sendKeys(datamap.get("firstname"));
		createnewaccountpage.lastnamefield().sendKeys(datamap.get("lastname"));
		createnewaccountpage.emailaddressfield().sendKeys(datamap.get("email"));
		createnewaccountpage.passwordfield().sendKeys(datamap.get("password"));
		createnewaccountpage.passwordconfirmationfield().sendKeys(datamap.get("confirmpassword"));


	}

	@When("user has click create an account option")
	public void user_has_click_create_an_account_option() {

		createnewaccountpage.createanaccountbutton().click();
	}

	@Then("user should get a proper success messege")
	public void user_should_get_a_proper_success_messege() {

		myAccountHomepage myaccounthomepage = new myAccountHomepage(driver);
		if(myaccounthomepage.newaccountsucessmsg().isDisplayed()){

			System.out.println("sucessfull creates account");
		}else {

			System.out.println("sucessfull creates account failure");
		}


	}

	@When("user has entered below 3rd details")
	public void user_has_entered_below_3rd_details(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> datamap = dataTable.asMap(String.class, String.class);

		createnewaccountpage = new CreateNewAccountPage(driver);
		createnewaccountpage.firstnamefield().sendKeys(datamap.get("firstname"));
		createnewaccountpage.lastnamefield().sendKeys(datamap.get("lastname"));
		createnewaccountpage.emailaddressfield().sendKeys(datamap.get("email"));
		createnewaccountpage.passwordfield().sendKeys(datamap.get("password"));
		createnewaccountpage.passwordconfirmationfield().sendKeys(datamap.get("confirmpassword"));

	}

	/*@When("user has click on new sletter checkbox")
	public void user_has_click_on_new_sletter_checkbox() {

		createnewaccountpage.newslettercheckbox().click();

	}*/

	@When("user has entered below duplecate details")
	public void user_has_entered_below_duplecate_details(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> datamap = dataTable.asMap(String.class, String.class);

		createnewaccountpage = new CreateNewAccountPage(driver);
		createnewaccountpage.firstnamefield().sendKeys(datamap.get("firstname"));
		createnewaccountpage.lastnamefield().sendKeys(datamap.get("lastname"));
		createnewaccountpage.emailaddressfield().sendKeys(datamap.get("email"));
		createnewaccountpage.passwordfield().sendKeys(datamap.get("password"));
		createnewaccountpage.passwordconfirmationfield().sendKeys(datamap.get("confirmpassword"));

	}

	@Then("user should get a proper existingemail warning messege")
	public void user_should_get_a_proper_existingemail_warning_messege() {

		createnewaccountpage = new CreateNewAccountPage(driver);

		if(createnewaccountpage.existingemailerrormsg().isDisplayed()){

			System.out.println("existingemailerror msg shown");
		}else {
			System.out.println("failure");
		}
	}

	@When("user has not entered any details")
	public void user_has_not_entered_any_details() {

		createnewaccountpage = new CreateNewAccountPage(driver);
		createnewaccountpage.firstnamefield().sendKeys("");
		createnewaccountpage.lastnamefield().sendKeys("");
		createnewaccountpage.emailaddressfield().sendKeys("");
		createnewaccountpage.passwordfield().sendKeys("");
		createnewaccountpage.passwordconfirmationfield().sendKeys("");

	}

	@Then("user should get a proper no details warning messege")
	public void user_should_get_a_proper_no_details_warning_messege() {

		CreateNewAccountPage createnewaccountpage = new CreateNewAccountPage(driver);
		Assert.assertTrue(createnewaccountpage.firstnameerrormsg().isDisplayed());
		Assert.assertTrue(createnewaccountpage.lastnameerrormsg().isDisplayed());
		Assert.assertTrue(createnewaccountpage.emailerrormsg().isDisplayed());
		Assert.assertTrue(createnewaccountpage.passworderrormsg().isDisplayed());
		Assert.assertTrue(createnewaccountpage.confirmpassworderrormsg().isDisplayed());

		System.out.println("no details warning messege displayed");

	}

	@Given("user has navigate to customer login page clicks on create an account option")
	public void user_has_navigate_to_customer_login_page_clicks_on_create_an_account_option() {

		driver= DriverFactory.getdriver();
		HomePage homepage = new HomePage(driver);
		homepage.signinoption().click();

		CustomerloginPage cutstomerloginpage = new CustomerloginPage(driver);
		cutstomerloginpage.createanaccountoption().click();
	}

	@When("user has entered below 4th details")
	public void user_has_entered_below_4th_details(io.cucumber.datatable.DataTable dataTable) {

		Map<String, String> datamap = dataTable.asMap(String.class, String.class);

		createnewaccountpage = new CreateNewAccountPage(driver);
		createnewaccountpage.firstnamefield().sendKeys(datamap.get("firstname"));
		createnewaccountpage.lastnamefield().sendKeys(datamap.get("lastname"));
		createnewaccountpage.emailaddressfield().sendKeys(datamap.get("email"));
		createnewaccountpage.passwordfield().sendKeys(datamap.get("password"));
		createnewaccountpage.passwordconfirmationfield().sendKeys(datamap.get("confirmpassword"));
	}

}
