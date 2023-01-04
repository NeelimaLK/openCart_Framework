package testCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;
import testCases.BaseTestCase;

public class RegPageTestCases extends BaseTestCase{
	@Test
	public void testAccountRegistrationPage() throws InterruptedException
	{
		try
		{
			HomePage hp= new HomePage(driver);
		
		logger.info("Clicking on MyAccount link");	
		
		hp.clickMyAccount();
		hp.clickRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		logger.info("Providing customer details");
		regpage.setFirstName(randomeString().toUpperCase());
		regpage.setLastName(randomeString().toUpperCase());
		regpage.setEmail(randomeString()+"@gmail.com");
		String password=randomAlphaNumeric();
		regpage.setPassword(password);
		regpage.setPrivacyPolicy();
        AssertJUnit.fail();
		logger.info("Clicking on Continue");
		regpage.clickContinue();
	}
		catch(Exception e)
		{
			logger.error("test failed");
			AssertJUnit.fail();
		}
		
		
		
	}
	

}
