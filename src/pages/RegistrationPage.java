package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class RegistrationPage extends BaseClass {
	//create element 
	@FindBy(name="firstName")
	WebElement firstname;
	@FindBy(name="lastName")
	WebElement lastname;
	@FindBy(xpath="//tbody/tr[4]/td[2]/input[1]")
	WebElement phoneNumber;
	@FindBy(xpath="//input[@id='userName']")
	WebElement Email;
	@FindBy(id="email")
	WebElement UserName;
	@FindBy(name="password")
	WebElement PassWord;
	@FindBy(name="confirmPassword")
	WebElement confirmepassWord;
	@FindBy(name="submit")
	WebElement submit;
	//loading all element in to the driver
	public RegistrationPage() { 
		PageFactory.initElements(driver,this);
	}
	//define functionalities
	public void enterFirstName(String firstName) {
		firstname.sendKeys(firstName);
	}
	public void enterLastName(String lastName) {
		lastname.sendKeys(lastName);
	}
	public void enterPhoneNumber(String phonenumber) {
		phoneNumber.sendKeys(phonenumber);
	}
	public void enterEmail(String email) {
		Email.sendKeys(email);
	}
	public void enterUserName(String username) {
		UserName.sendKeys(username);
	}
	public void eneterPassword(String password) {
		PassWord.sendKeys(password);
	}
	public void enterConfirmpassword(String confirmpassword) {
		confirmepassWord.sendKeys(confirmpassword);
	}
	public void submit() {
		submit.click();
	}
	public String returnRegistrationPageTitle() {
		 return driver.getTitle();
	}
	public String returnRegistrationPageUrl() {
		return driver.getCurrentUrl();
	}
}
	
