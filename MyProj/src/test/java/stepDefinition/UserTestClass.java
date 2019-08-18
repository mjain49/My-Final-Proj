package stepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageBean.UserPageFactory;

public class UserTestClass{
	
	private WebDriver driver;
	private UserPageFactory upf;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\softwares\\chromedriver_win32\\chromedriver.exe" );
		driver= new ChromeDriver();
		//driver=new FirefoxDriver();
	}
@Given("^User is on 'register' Page$")
public void user_is_on_register_Page() throws Throwable {
	driver.get("D:\\BDD Workspace\\MyProj\\target\\Select.html");
	upf = new UserPageFactory(driver);
	Thread.sleep(2000);
}

@When("^User Enters Invalid Category$")
public void user_Enters_Invalid_Category() throws Throwable {
	upf.setCategory("");
	upf.setRedirect();
}

@Then("^display 'Please Enter Valid Category'$")
public void display_Please_Enter_Valid_Category() throws Throwable {
    System.out.println("Please Enter Valid Category");
}

@When("^User Enters Valid Category and Category=\"(.*?)\"$")
public void user_Enters_Valid_Category_and_Category(String arg1) throws Throwable {
	upf.setCategory("User");
	upf.setRedirect();
}

@When("^Display 'user' page$")
public void display_user_page() throws Throwable {
	driver.get("D:\\\\BDD Workspace\\\\MyProj\\\\target\\\\User.html");
	upf = new UserPageFactory(driver);
	Thread.sleep(2000);
}


@When("^User Enters Invalid First Name$")
public void user_Enters_Invalid_First_Name() throws Throwable {
    upf.setFname("");
//	String expectedMessage="*Please Enter First Name";
//	String actualMessage=getFnameError();
//	Assert.assertEquals(expectedMessage, actualMessage);
//	driver.switchTo().alert().accept();
	upf.setConfirmButton();
}

@Then("^display 'Please Enter Valid First Name'$")
public void display_Please_Enter_Valid_First_Name() throws Throwable {
	System.out.println("*Please Enter First Name");
}

@When("^User Enters Invalid Last Name$")
public void user_Enters_Invalid_Last_Name() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("");
	upf.setConfirmButton();
    
}

@Then("^display 'Please Enter Valid Last Name'$")
public void display_Please_Enter_Valid_Last_Name() throws Throwable {
	System.out.println("*Please Enter Last Name");
    
}

@When("^User Enters Invalid Mobile Number$")
public void user_Enters_Invalid_Mobile_Number() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("");
	upf.setConfirmButton();
    
}

@Then("^display 'Please Enter Valid Mobile Number'$")
public void display_Please_Enter_Valid_Mobile_Number() throws Throwable {
	System.out.println("*Please Enter Mobile Number");
}

@When("^User Enters Invalid Address$")
public void user_Enters_Invalid_Address() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("");
	upf.setConfirmButton();
    
}

@Then("^display 'Please Enter Your Valid Address'$")
public void display_Please_Enter_Your_Valid_Address() throws Throwable {
	System.out.println("*Please Enter Address");
}

@When("^User Enters Invalid EmailID$")
public void user_Enters_Invalid_EmailID() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("");
	upf.setConfirmButton();
    
}

@Then("^display 'Please Enter Valid EmailID'$")
public void display_Please_Enter_Valid_EmailID() throws Throwable {
	System.out.println("*Please Enter mail");
}

@Given("^User is on 'user' page$")
public void user_is_on_user_page() throws Throwable {
	driver.get("D:\\\\BDD Workspace\\\\MyProj\\\\target\\\\User.html");
	upf = new UserPageFactory(driver);
	Thread.sleep(2000);
    
}

@When("^User Enters Invalid Password$")
public void user_Enters_Invalid_Password() throws Throwable {
    
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("mayur1234@capgemini.com");
	upf.setPassword("");
	upf.setConfirmButton();
}

@Then("^display 'Please Enter Valid Password'$")
public void display_Please_Enter_Valid_Password() throws Throwable {
	System.out.println("*Please Enter password");
    
}

@When("^User Enters Invalid ConfirmPassword$")
public void user_Enters_Invalid_ConfirmPassword() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("mayur1234@capgemini.com");
	upf.setPassword("Asdf@1234");
	upf.setConfirmpassword("");
	upf.setConfirmButton(); 
}

@Then("^display 'Please Enter Valid ConfirmPassword'$")
public void display_Please_Enter_Valid_ConfirmPassword() throws Throwable {
	System.out.println("*Please Enter Confirmpassword");
    
}

@When("^User Enters Invalid Answer for SecrityQuestion one$")
public void user_Enters_Invalid_Answer_for_SecrityQuestion_one() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("mayur1234@capgemini.com");
	upf.setPassword("Asdf@1234");
	upf.setConfirmpassword("Asdf@1234");
	upf.setFsq("");
	upf.setConfirmButton();
}

@Then("^display 'Please Enter Valid Answer for SecrityQuestion one'$")
public void display_Please_Enter_Valid_Answer_for_SecrityQuestion_one() throws Throwable {
	System.out.println("*Please Enter Answer for SecrityQuestion one");
}

@When("^User Enters Invalid Answer for SecrityQuestion two$")
public void user_Enters_Invalid_Answer_for_SecrityQuestion_two() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("mayur1234@capgemini.com");
	upf.setPassword("Asdf@1234");
	upf.setConfirmpassword("Asdf@1234");
	upf.setFsq("Mumbai");
	upf.setSsq("");
	upf.setConfirmButton();
}

@Then("^display 'Please Enter Valid Answer for SecrityQuestion two'$")
public void display_Please_Enter_Valid_Answer_for_SecrityQuestion_two() throws Throwable {
	System.out.println("*Please Enter Answer for SecrityQuestion two");
}

@Then("^display 'Please Enter Valid Answer for SecrityQuestion(\\d+)'$")
public void display_Please_Enter_Valid_Answer_for_SecrityQuestion(int arg1) throws Throwable {
	System.out.println("*Please Enter Answer for SecrityQuestion "+arg1);
}

@Given("^User is on 'user' Page$")
public void user_is_on_user_Page() throws Throwable {
	driver.get("D:\\\\BDD Workspace\\\\MyProj\\\\target\\\\User.html");
	upf = new UserPageFactory(driver);
	Thread.sleep(2000);
}

@When("^User clicks on Create Account$")
public void user_clicks_on_Create_Account() throws Throwable {
	upf.setFname("Mayur");
	upf.setLname("Jain");
	upf.setMobileno("8652407781");
	upf.setAddress("Capgemini");
	upf.setEmail("mayur1234@capgemini.com");
	upf.setPassword("Asdf@1234");
	upf.setConfirmpassword("Asdf@1234");
	upf.setFsq("Mumbai");
	upf.setSsq("Ram");
	upf.setConfirmButton();
    
}

@Then("^display 'success' Page$")
public void display_success_Page() throws Throwable {
	driver.get("D:\\BDD Workspace\\MyProj\\target\\success.html");
}

}