package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FlightPage extends BaseClass {
	@FindBy(xpath="//input[@value='roundtrip']")
	WebElement tripType;
	@FindBy(xpath="//input[@value='Business']")
	WebElement serviceTypes;
	@FindBy(xpath="//input[@name='findFlights']")
	WebElement contin;
	public FlightPage() {
		PageFactory.initElements(driver, this);
	}
	public void clicktripType() {
		tripType.click();
	}
	public void clickservices() {
		serviceTypes.click();
	}
	public void clickcontinu() {
		contin.click();
	}
	public String returnFlightPageTitle() {
		  return driver.getTitle();
	   }
	   public String returnFlightPageUrl() {
		  return driver.getCurrentUrl();
	   }

}
