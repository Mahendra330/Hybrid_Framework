package stepDefinations;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksStepDefinations {

	@Before // This will execute before all Test Scenarios
	public void setup() {
		 System.out.println("Launch browser");
		 System.out.println("Enter URL");
	}
	
@After   // This will execute after all Test Scenarios
	public void tearDown() {
		 System.out.println("Close browser");
		 
	}
@Given("^User is in Add customer page$")
public void user_is_in_Add_customer_page() throws Throwable {
    System.out.println("User is in Add customer page");
}

@When("^user fills the customer deatils$")
public void user_fills_the_customer_deatils() throws Throwable {
	System.out.println("user fills the customer deatils");
}

@Then("^Customer is added$")
public void customer_is_added() throws Throwable {
	System.out.println("Customer is added");
}

@Given("^User is on Edit customer page$")
public void user_is_on_Edit_customer_page() throws Throwable {
	System.out.println("User is on Edit customer page");
}

@When("^user edit contact deatils$")
public void user_edit_contact_deatils() throws Throwable {
	System.out.println("user edit contact deatils");
}

@Then("^Contact details updated$")
public void contact_details_updated() throws Throwable {
	System.out.println("Contact details updated");
}

@Given("^User is on delete customer page$")
public void user_is_on_delete_customer_page() throws Throwable {
	System.out.println("User is on delete customer page");
}

@When("^user delete the customer deatils$")
public void user_delete_the_customer_deatils() throws Throwable {
	System.out.println("user delete the customer deatils");
}

@Then("^Customer is deleted$")
public void customer_is_deleted() throws Throwable {
	System.out.println("Customer is deleted");
}


}
