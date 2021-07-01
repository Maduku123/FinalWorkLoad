package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class ResgistrationSuccessfulPage extends BaseClass {
	@FindBy(xpath="//table[@width='492']/tbody/tr[1]")
	WebElement resgistrationSuccessfulPage;
	public ResgistrationSuccessfulPage() {
		PageFactory.initElements(driver,this);
	}
	public boolean validateRegistrationSuccessfulMge() {
		return resgistrationSuccessfulPage.isDisplayed();
	}
	public String returnResgistrationSuccessfulPageTitle() {
		  return driver.getTitle();
	   }
	   public String returnResgistrationSuccessfulPageUrl() {
		  return driver.getCurrentUrl();
	   }
}
