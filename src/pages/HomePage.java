package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class HomePage extends BaseClass {
	//creating element
	@FindBy(name="userName")
	WebElement userName;
	@FindBy(name="password")
	WebElement passWord;
	@FindBy(name="submit")
	WebElement submit;
	@FindBy(linkText="REGISTER")
	WebElement register;
	@FindBy(xpath="//a[contains(text(),'Flights')]")
	WebElement flights;
	//load all element in driver.
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	//define functionality
	public void enterUserName(String username) {
		userName.sendKeys(username);
	}
   public void enterPassWord(String password) {
	   passWord.sendKeys(password);  
   }
   public void clicksubmit() {
	   submit.click();
   }
   public void clickRegisterLink() {
	   register.click();
   }
   public void clickFlightLink() {
	   flights.click();
   }
   public String returnHomePageTitle() {
	  return driver.getTitle();
   }
   public String returnHomepageUrl() {
	  return driver.getCurrentUrl();
   }
}
