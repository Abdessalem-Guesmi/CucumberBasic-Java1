package StepsDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("i'm a Given method: user on login page");
	}

	@When("user enters  username and password")
	public void user_enters_username_and_password() {
		System.out.println("i'm a When method: user enters username and password");
	}

	@And("clicks on button")
	public void clicks_on_button() {
		System.out.println("i'm a And method: user clicks on button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("i'm a Then method: user navigated to the home page");
	}

}
