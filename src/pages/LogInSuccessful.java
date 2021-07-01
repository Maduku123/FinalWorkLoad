package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class LogInSuccessful extends BaseClass {
	@FindBy(xpath="//tbody//tr//td//h3")
	WebElement loginsuccessful;
	public LogInSuccessful() {
		PageFactory.initElements(driver,this);
	}
	public boolean validateLogInSuccessful() {
		return loginsuccessful.isDisplayed();
	}
	 public String returnLogInSuccessfulTitle() {
		  return driver.getTitle();
	   }
	   public String returnLogInSuccessfulUrl() {
		  return driver.getCurrentUrl();
	   }
}
