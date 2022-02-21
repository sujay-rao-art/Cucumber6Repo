package stepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ScenarioOutLineStepDefination {

	@Given("Start application")
	public void start_application() 
	{
		System.out.println("Application started");

	}

	@When("user enter username as {string} and password  as {string}")
	public void user_enter_username_as_and_password_as(String uname, String pass) {
			
		System.out.println("User entered username as "+uname);
		System.out.println("User entered username as "+pass);
	}

	@Then("login to application")
	public void login_to_application() {
		System.out.println("Login Done");
	}

}
