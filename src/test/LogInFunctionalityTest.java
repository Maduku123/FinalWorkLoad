package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.HomePage;
import pages.LogInSuccessful;

public class LogInFunctionalityTest extends BaseClass {
HomePage HP;
LogInSuccessful LS;
@BeforeMethod
public void loadBrowser() {
	initiazation();
	HP=new HomePage();
	LS=new LogInSuccessful();
}
@AfterMethod
public void closeBrowser() {
	tearDown();	
}
@Test(dataProvider="positiveloginTest")
public void positiveTest(String name,String password) {
	Assert.assertEquals(HP.returnHomePageTitle(), pro.get("ExpectHomepageTitle"));
	HP.enterUserName(name);
	HP.enterPassWord(password);
	HP.clicksubmit();
	Assert.assertEquals(HP.returnHomepageUrl(),pro.get("ExpectedLogInSucessfulURL"));
}
@DataProvider(name="positiveloginTest")
public Object[][] getData() {
	Object[][]data = {{"test123","123"}};
	return data;
}
}
