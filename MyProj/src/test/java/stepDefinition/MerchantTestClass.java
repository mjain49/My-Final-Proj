package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.MerchantPageFactory;
import pageBean.UserPageFactory;

public class MerchantTestClass{
	
	private WebDriver driver;
	private MerchantPageFactory mpf;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
	}
	@Given("^User is on 'register' Page$")
	public void user_is_on_register_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Category$")
	public void user_Enters_Invalid_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Category'$")
	public void display_Please_Enter_Valid_Category() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Valid Category and Category=\"([^\"]*)\"$")
	public void user_Enters_Valid_Category_and_Category(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^Display 'merchant' page$")
	public void display_merchant_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^User is on 'merchant' Page$")
	public void user_is_on_merchant_Page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid First Name$")
	public void user_Enters_Invalid_First_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid First Name'$")
	public void display_Please_Enter_Valid_First_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Last Name$")
	public void user_Enters_Invalid_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Last Name'$")
	public void display_Please_Enter_Valid_Last_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Company Name$")
	public void user_Enters_Invalid_Company_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Company Name'$")
	public void display_Please_Enter_Valid_Company_Name() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Mobile Number$")
	public void user_Enters_Invalid_Mobile_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Mobile Number'$")
	public void display_Please_Enter_Valid_Mobile_Number() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Address$")
	public void user_Enters_Invalid_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Your Valid Address'$")
	public void display_Please_Enter_Your_Valid_Address() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Given("^User is on 'merchant' page$")
	public void user_is_on_merchant_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Password$")
	public void user_Enters_Invalid_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Password'$")
	public void display_Please_Enter_Valid_Password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid ConfirmPassword'$")
	public void display_Please_Enter_Valid_ConfirmPassword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User Enters Invalid Answer for SecrityQuestion(\\d+)$")
	public void user_Enters_Invalid_Answer_for_SecrityQuestion(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Please Enter Valid Answer for SecrityQuestion(\\d+)'$")
	public void display_Please_Enter_Valid_Answer_for_SecrityQuestion(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^User clicks on Create Account$")
	public void user_clicks_on_Create_Account() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display 'Yoursuccess' Page$")
	public void display_Yoursuccess_Page() throws Throwable {
	    
	    
	}


}