package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import UtilityLayer.Wait;
import io.cucumber.java.en.When;

public class contactPage extends Baseclass{
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	public contactPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void userClickOnContactLinkPage() {
		Wait.click(contactLink);
		
		
	    
	}

	public void userClickOnCreateButton() {
		Wait.click(createButton);
	    
	}
	
	public void userEnterFirstNameAndLastName(String Fname,String Lname) {
		Wait.sendKeys(fname, Fname);
		Wait.sendKeys(lname, Lname);
	   
	}


}
