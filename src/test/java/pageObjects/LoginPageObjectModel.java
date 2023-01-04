package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjectModel extends BasePage {
	
	public LoginPageObjectModel(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='input-email']")
	WebElement txtEmailAddress;
	
	@FindBy(xpath="//input[@id='input-password']")
	WebElement txtPassword;
	
   @FindBy(xpath="//button[@type='submit']")
   WebElement loginBtn;
   
   public void enterEmail(String email)
   {
	   txtEmailAddress.sendKeys(email);
   }
   public void enterPassword(String password)
   {
	   txtPassword.sendKeys(password);
   }
   public void clickLoginBtn()
   {
	   loginBtn.click();
   }
}
