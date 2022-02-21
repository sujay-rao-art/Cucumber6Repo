package stepDefinations;

import org.junit.Assert;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class LoginStepDefination {

	HomePage home;
	
	@Given("Application is up and running and validated")
	public void application_is_up_and_running_and_validated() 
	{
		home=new HomePage(BrowserFactory.getDriver());
		BrowserFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		BrowserFactory.getDriver().manage().window().maximize();
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String uname) 
	{
		home.enterUsername(uname);
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String pass) {
		home.enterPassword(pass);
	}

	@When("user click on login button")
	public void user_click_on_login_button() {
		home.clickOnLoginButton();
	}

	@Then("user should be able to see dashboard")
	public void user_should_be_able_to_see_dashboard() {
			Assert.assertTrue(BrowserFactory.getDriver().getCurrentUrl().contains("dashboard"));
	}

	
	
}
