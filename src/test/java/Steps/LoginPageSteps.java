package Steps;

import Baselayer.Baseclass;
import PageLayer.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps extends Baseclass{
	
	public static LoginPage log;

	
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    Baseclass.initialization();
	}

	@When("user enter username and password")
	public void user_enter_username_and_password() {
		String uname = prop.getProperty("USERNAME");
		String Password = prop.getProperty("PASSWORD");
		 log = new LoginPage();
		 log.userEnterUsernameAndPassword(uname, Password);
	}

	@Then("user click on login button")
	public void user_click_on_login_button() {
	  log.userClickOnLoginButton();
	}
}
