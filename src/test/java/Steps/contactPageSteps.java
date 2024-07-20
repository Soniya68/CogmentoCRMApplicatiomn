package Steps;

import Baselayer.Baseclass;
import PageLayer.contactPage;
import io.cucumber.java.en.When;

public class contactPageSteps extends Baseclass{
	private static contactPage conPage;

@When("user click on contact link page")
public void user_click_on_contact_link_page() {
	 conPage=new contactPage();
	 conPage.userClickOnContactLinkPage();
	
    
}

@When("user click on create button")
public void user_click_on_create_button() {
	conPage.userClickOnCreateButton();
    
}
@When("user enter first name and last name")
public void user_enter_first_name_and_last_name() {
	conPage.userEnterFirstNameAndLastName("Soniya", "Warse");
   
}

}
