package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Baselayer.Baseclass;
import UtilityLayer.Wait;

public class LoginPage extends Baseclass{
	
	@FindBy(name="email")
	private WebElement name;
	
	@FindBy(name="password")
	private WebElement pass;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginbutton;
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public void userEnterUsernameAndPassword(String username,String password) {
		Wait.sendKeys(name,username);
		Wait.sendKeys(pass,password);
		
		
	}
	public void userClickOnLoginButton() {
		Wait.click(loginbutton);
	}
	

}
