package pspTechCucumber.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pspTechCucumber.baseClass.BaseClass;
import pspTechCucumber.browserFactory.BrowserFactory;
import pspTechCucumber.pages.Login;
import pspTechCucumber.pages.Registration;
import pspTechCucumber.utilities.CommonMethods;

public class StepDefinitions extends BaseClass {

	public StepDefinitions() {
		super(driver);
		
	}
Registration registration;
Login login;

@Given("User enters the url of the Mercury Tours application")
public void user_enters_the_url_of_the_mercury_tours_application() {
	driver= BrowserFactory.initiateBrowser();
	logger.info("Browser is getting initializwd - Opening Home Page");
	registration = PageFactory.initElements(driver, Registration.class);
	CommonMethods.maximizeBrowser();
	CommonMethods.getTitle(driver, "Welcome: Mercury Tours");
	CommonMethods.getUrl(driver, "https://demo.guru99.com/test/newtours/");
}

	@Given("Clicks on Registration")
public void clicks_on_registration( ) {
		logger.info("clicks on Registration");
		CommonMethods.click(registration.homeRegnPageLinkClick, driver);
		CommonMethods.getUrl(driver, "https://demo.guru99.com/test/newtours/register.php");
	
}
   @And("User navigates to the registration page")
public void user_navigates_to_the_registration_page() {
	   logger.info("Navigating to Registration Page");
	   CommonMethods.click(registration.homeRegnPageLinkClick, driver);
		CommonMethods.getUrl(driver, "https://demo.guru99.com/test/newtours/register.php");

}

@When("User enters the all required data")
public void user_enters_the_all_required_data() {
	CommonMethods.sendData(registration.regnFirstName, driver, "Khadiza");
	CommonMethods.sendData(registration.regnLastName, driver, "Akter");
	CommonMethods.sendData(registration.regnPhone, driver, "01732753988");
	CommonMethods.sendData(registration.regnEmail, driver, "Khadiza@gmail.com");
	CommonMethods.sendData(registration.regnAddress, driver, "Dhaka");
	CommonMethods.sendData(registration.regnCity, driver, "Tangail");
	CommonMethods.sendData(registration.regnState, driver, "Tangail");
	CommonMethods.sendData(registration.regnPostalCode, driver, "1900");
	CommonMethods.sendData(registration.regnCountry, driver, "Bangladesh");
	CommonMethods.sendData(registration.regnUserName, driver, "Khadiza");
	CommonMethods.sendData(registration.regnPassword, driver, "2013");
	CommonMethods.sendData(registration.regnConfirmPassword, driver, "2013");
	CommonMethods.click(registration.regnSubmit, driver);
	
    
}
@And("User clicks on the submit button")
public void user_clicks_on_the_submit_button() {
   
}
@Then("successfully registers into the Murcury Tours application")
public void successfully_registers_into_the_murcury_tours_application() {
    
}

@When("User does not enter all required data")
public void user_does_not_enter_all_required_data() {
 
}
@When("User clicks on the submit button without all data")
public void user_clicks_on_the_submit_button_without_all_data() {
 
}
@Then("User fails to registers  into the Murcury Tours application")
public void user_fails_to_registers_into_the_murcury_tours_application() {
 
}







}

