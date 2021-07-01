package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.FlightPage;
import pages.FlightSuccessfulPage;
import pages.HomePage;

public class FlightFunctionalityTest extends BaseClass {
	HomePage HP;
	FlightPage FP;
	FlightSuccessfulPage FS;
	@BeforeMethod
	public void loadBrowser() {
		initiazation();
		HP= new HomePage();
		FP=new FlightPage();
		FS=new FlightSuccessfulPage();
		
		
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
		
	}
	@Test
	public void positiveFlightFunctionalityTest() {
		Assert.assertEquals(HP.returnHomePageTitle(), pro.get("ExpectHomepageTitle"));
		HP.clickFlightLink();
		FP.clicktripType();
		FP.clickservices();
		FP.clickcontinu();
		Assert.assertEquals(FS.returnFlightSuccessfulPageUrl(),pro.get("ExpectedFlightSuccessfulURL"));
		
	}

}
