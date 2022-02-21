package stepDefinations;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class DataTableStepDefinations 
{
	
	@Given("the following animals:")
	public void the_following_animals(io.cucumber.datatable.DataTable dataTable) {
	    
	 List<String>data=dataTable.asList();
		
	 System.out.println("Data is "+data);
	 
	}
	
	@Then("user should be able to login")
	public void user_should_be_able_to_login() {
	    System.out.println("Login done");
	}

	@Given("the following login:")
	public void the_following_login(io.cucumber.datatable.DataTable dataTable) {
	   
		List<Map<String, String>> data=dataTable.asMaps();
		
		System.out.println(data.get(0).get("Username"));
		System.out.println(data.get(0).get("Password"));

		System.out.println("New record");
		
		System.out.println(data.get(1).get("Username"));
		System.out.println(data.get(1).get("Password"));
		
		System.out.println("New record");
		
		System.out.println(data.get(2).get("Username"));
		System.out.println(data.get(2).get("Password"));
		
	}

	@Then("user should be able to login and see dashboard")
	public void user_should_be_able_to_login_and_see_dashboard() {
	    System.out.println("Login with dashboard");
	}

}
