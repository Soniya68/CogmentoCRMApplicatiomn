package UtilityLayer;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Baselayer.Baseclass;

public class Wait extends Baseclass{
	
	public static WebElement visibilityOf(WebElement wb) {
		return new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.visibilityOf(wb));
	}
	
	public static void sendKeys(WebElement wb,String value) {
		Wait.visibilityOf(wb).sendKeys(value);
	}
	
	public static void click(WebElement wb) {
		new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.elementToBeClickable(wb)).click();
	}
}