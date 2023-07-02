package pspTechCucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import pspTechCucumber.baseClass.BaseClass;

public class Registration extends BaseClass {

	public Registration() {
		super(driver);	
	}
	
	@FindBy (xpath = "(//a[@href='register.php'])[1]")
	public WebElement homeRegnPageLinkClick;
	
	@FindBy(name="firstName")
	public WebElement regnFirstName;
	
	@FindBy(how = How.NAME, using = "lastName")
	public WebElement regnLastName;
	
	@FindBy(how = How.NAME, using = "phone")
	public WebElement regnPhone;
	
	@FindBy(name="userName")
	public WebElement regnEmail;
	
	@FindBy(name="address1")
	public WebElement regnAddress;
	
	@FindBy(name="city")
	public WebElement regnCity;
	
	@FindBy(name="state")
	public WebElement regnState;
	
	@FindBy(how = How.NAME, using = "postalCode")
	public WebElement regnPostalCode;
	
	@FindBy(tagName="Country:")
	public WebElement regnCountry;
	
	@FindBy(tagName="User Name")
	public WebElement regnUserName;
	
	@FindBy(tagName="Password:")
	public WebElement regnPassword;
	
	@FindBy(tagName="confirm password")
	public WebElement regnConfirmPassword;
	
	
	@FindBy(name="submit")
	public WebElement regnSubmit;
	

	
}
