package testCases;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPageObjectModel;
import utilitiesFiles.DataProviders;

public class LoginPageTest extends BaseTestCase
{
	@Test(dataProvider = "LoginData", dataProviderClass = DataProviders.class)
	public void test_Loging(String email, String pwd, String exp)
	{
		logger.info("******Starting LoginPageTest*******");
		HomePage hp = new HomePage(driver);
		
		logger.info("Click on MyAccount and  Login Button");
		hp.clickMyAccount();
		hp.clickLogin();
		
		logger.info("Entering LoginPage Details");
		LoginPageObjectModel lp= new LoginPageObjectModel(driver);
		lp.enterEmail(email);
		lp.enterPassword(pwd);
		lp.clickLoginBtn();
		
		
		
		}
	

}
