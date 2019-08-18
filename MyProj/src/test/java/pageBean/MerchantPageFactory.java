package pageBean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MerchantPageFactory {

	// Driver definition
	WebDriver driver;

	// Initiating the Driver
	public MerchantPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// Step 1 : Identify Elements
	
	@FindBy(name="category")
	@CacheLookup
	WebElement category;
	
	@FindBy(id = "sbtn")
	@CacheLookup
	WebElement Redirect;
	
	@FindBy(name = "firstName") // find by is to find element name specified in the form
	@CacheLookup // to cache the value of that element of the form whose name is specified inside
					// FindBy tag
	WebElement fname;

	@FindBy(name = "lastName")
	@CacheLookup
	WebElement lname;

	@FindBy(name = "mobileNo")
	@CacheLookup
	WebElement mobileno;

	@FindBy(name = "address")
	@CacheLookup
	WebElement address;

	@FindBy(name = "email")
	@CacheLookup
	WebElement email;

	@FindBy(id = "password")
	@CacheLookup
	WebElement password;

	@FindBy(id = "confirmPass")
	@CacheLookup
	WebElement confirmpassword;

	@FindBy(id = "firstSecurityQuestion")
	@CacheLookup
	WebElement fsq;

	@FindBy(id = "secondSecurityQuestion")
	@CacheLookup
	WebElement ssq;

	@FindBy(className = "btn")
	@CacheLookup
	WebElement confirmButton;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]")
	WebElement fnameError;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[3]")
	WebElement lnameError;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[4]/td[4]")
	WebElement mobileError;

	@FindBy(xpath = "//*[@id=\"addressErrMsg\"]")
	WebElement addressError;

	@FindBy(xpath = "//*[@id=\"mailErrMsg\"]")
	WebElement mailError;

	@FindBy(xpath = "//*[@id=\"passErrMsg\"]")
	WebElement passError;

	@FindBy(xpath = "//*[@id=\"cpassErrMsg\"]")
	WebElement cpassError;

	@FindBy(xpath = "//*[@id=\"fsqErrMsg\"]")
	WebElement fsqError;

	@FindBy(xpath = "//*[@id=\"ssqErrMsg\"]")
	WebElement ssqError;