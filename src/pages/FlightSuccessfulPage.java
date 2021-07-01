package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class FlightSuccessfulPage extends BaseClass {
@FindBy(xpath="//tbody/tr[1]/td[1]/p[1]/font[1]/b[1]/font[1]")
WebElement flightsuccessfulMge;
public FlightSuccessfulPage() {
	PageFactory.initElements(driver,this);
}
public boolean validateFlightSuccessfullPage() {
	return flightsuccessfulMge.isDisplayed();
}
public String returnFlightSuccessfulPageTitle() {
	  return driver.getTitle();
 }
 public String returnFlightSuccessfulPageUrl() {
	  return driver.getCurrentUrl();
 }
}
