package stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import enviroment.Enviroment;
import methods.ContactMethod;

public class ContactUs extends Enviroment{
WebDriver driver = browsersetup();  {
		
	}

	
	@Given("^User navigate to Contact us$")
	public void user_navigate_to_Contact_us() throws Throwable {
	    ContactMethod contact=new ContactMethod(driver);
	    contact.Contact();
	    Thread.sleep(3000);
	    driver.close();
		
	}

	@When("^User complete message and subject fields$")
	public void user_complete_message_and_subject_fields() throws Throwable {
		ContactMethod contact=new ContactMethod(driver);
		contact.Dropdown();
		contact.Email();
		contact.Reference();
		contact.Message();
	}

	@Then("^User click on submit button$")
	public void user_click_on_submit_button() throws Throwable {
		ContactMethod contact=new ContactMethod(driver);
		contact.Submit();
	}

}
