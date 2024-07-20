package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import UtilityLayer.Wait;

public class contactPage extends Baseclass{
	
	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement createButton;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement save;
	
	
	@FindBy(xpath="//button[@class='ui button icon']")
	private WebElement delete;
	
	
	@FindBy(xpath="//button[text()='Delete']")
	private WebElement cdelete;

	
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
	
	public void userClickOnSaveButton() {
		Wait.click(save);	    
	}

	public void userClickOnDeleteAndConfirmelete() {
		Wait.click(delete);
		Wait.click(cdelete);
	  
	}



}
