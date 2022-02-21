package stepDefinations;

import org.junit.Assert;
import org.openqa.selenium.By;

import factory.BrowserFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SocialMediaLinkCheck 
{

	@Given("Application is up and running")
	public void application_is_up_and_running() {
	 
		BrowserFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		BrowserFactory.getDriver().manage().window().maximize();
	    
	}

	@When("User see home page")
	public void user_see_home_page() {
	    Assert.assertTrue(BrowserFactory.getDriver().getCurrentUrl().contains("orangehrmlive"));
	}

	@When("check footer section")
	public void check_footer_section() {
	    
		Assert.assertTrue(BrowserFactory.getDriver().findElement(By.xpath("//div[@id='social-icons']")).isDisplayed());
	    
	}

	@Then("social media links should be present")
	public void social_media_links_should_be_present() {
	    
	    Assert.assertTrue(BrowserFactory.getDriver().findElements(By.xpath("//div[@id='social-icons']//img")).size()==4);
	}

	@Then("all links should point to correct platforms")
	public void all_links_should_point_to_correct_platforms() {
	    
	    /*
	     * 		code to check broken links or mapping to right platform
	     * 
	     */
		
		
	}


}
