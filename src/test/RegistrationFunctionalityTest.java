package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.RegistrationPage;
import pages.ResgistrationSuccessfulPage;

public class RegistrationFunctionalityTest extends BaseClass {
	ResgistrationSuccessfulPage RSP;
	RegistrationPage RP;
	HomePage HP;
	@BeforeMethod
	public void loadBrowser() {
		initiazation();
		RSP=new ResgistrationSuccessfulPage();
		RP=new RegistrationPage();
		HP=new HomePage();
	}
	@AfterMethod
	public void closeBrowser() {
		tearDown();
	}
	@Test(dataProvider="NewMemberRegistration")
	public void newMemberRegistration(String firstname,String lastname,String phonenumber,String email,String username,String password) {
		Assert.assertEquals(HP.returnHomePageTitle(), pro.get("ExpectHomepageTitle"));
		HP.clickRegisterLink();
		RP.enterFirstName(firstname);
		RP.enterLastName(lastname);
		RP.enterPhoneNumber(phonenumber);
		RP.enterEmail(email);
		RP.enterUserName(username);
		RP.eneterPassword(password);
		RP.enterConfirmpassword(password);
		RP.submit();
		Assert.assertTrue(RSP.validateRegistrationSuccessfulMge());
		//Assert.assertEquals(RP.returnRegistrationPageUrl(), pro.get("ExpectedRegistrationPageURL"));
	}
	@DataProvider(name="NewMemberRegistration")
	public Object[][]  getData() {
		Object[][] data ={{"Mark","Ndi","2134280519","Mark@gmail.com","mark123","123"},
				{"John","Tata","2134280519","John@gmail.com","mark423","423"}};
		return data;
	
	}	
}
