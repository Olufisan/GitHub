package LogInImplementation;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Last.Straw.loginPOF;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import resources.base;

public class logInSteps extends base {

	WebDriver driver;
	

	@Given("^User initialising the browser$")
	public void user_initialising_the_browser() throws Throwable {
		driver = initialize();

	}

	@Given("^User navigates to the url \"([^\"]*)\"$")
	public void user_navigates_to_the_url(String arg1) throws Throwable {
		driver.get(arg1);
		System.out.println(driver.getTitle());
		Assert.assertEquals(driver.getTitle(), "Buy Phones, Fashion, Electronics in Nigeria | Konga Online Shopping");

	}

	@When("^User clicks on the Login/Signup$")
	public void user_clicks_on_the_Login_Signup() throws Throwable {
		loginPOF kr = new loginPOF(driver);
		kr.logIn().click();

	}

	
	@And("^Enter an invalid username with (.+) and password with (.+)$")
    public void enter_an_invalid_username_with_and_password_with(String username, String password) throws Throwable {
		loginPOF kr = new loginPOF(driver);
		kr.enter_username().sendKeys(username);
		kr.enter_password().sendKeys(password);
		
	}

	@When("^User clicks on the Login button$")
	public void user_clicks_on_the_Login_button() throws Throwable {
		loginPOF kr = new loginPOF(driver);
		kr.Log_In_Button().click();

		

	}

	@Then("^Error message is displayed$")
	public void error_message_is_displayed() throws Throwable {
		loginPOF kr = new loginPOF(driver);
		System.out.println("Confirm error message is displayed -  " + kr.error_message().isDisplayed());
		Assert.assertTrue(kr.error_message().isDisplayed());
		

	}

	@Then("^Close the browser$")
	public void close_the_browser() throws Throwable {
		driver.close();
	}

}
