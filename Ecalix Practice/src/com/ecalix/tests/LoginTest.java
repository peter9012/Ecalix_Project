package com.ecalix.tests;



import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.AssertJUnit;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.ecalix.common.CommonMethods;


public class LoginTest extends CommonMethods {
	public String nodeURL ="http://10.0.0.6:4444/wd/hub";
	@BeforeMethod
	public void setUp() throws MalformedURLException {
		DesiredCapabilities capability= DesiredCapabilities.chrome();
		capability.setBrowserName("chrome");
		capability.setPlatform(Platform.VISTA);
		driver = new RemoteWebDriver(new URL(nodeURL),capability);
//		OpenBrowser();
		GotoUrl();
	}
	@AfterMethod
	public void teardown(){
		CloseBrowser();
	}
	
	@Test
	public void Login01(){
		clickYourselflink();
		Login("ecalix@test.com","test123");
		String ExpectedText="Welcome to iBusiness";
		System.out.println("ExpectedText is"+ExpectedText);
		String ActualText=driver.findElement(By.xpath("//*[@id='bodyContent']/h1")).getText();
	    System.out.println("AcutalText is"+ActualText);
	    AssertJUnit.assertEquals(ExpectedText, ActualText);
	    clicklogoff();
	}

}