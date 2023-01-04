package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);
	}
	JavascriptExecutor js=(JavascriptExecutor)driver;
	// Elements
		@FindBy(xpath = "//input[@id='input-firstname']")
		WebElement firstName;

		@FindBy(xpath = "//input[@id='input-lastname']")
		WebElement lastName;

		@FindBy(xpath = "//input[@id='input-email']")
		WebElement eMail;

		

		@FindBy(xpath = "//input[@id='input-password']")
		WebElement txtPassword;
		
		@FindBy(xpath="//input[@id='input-newsletter-no']")
		WebElement newsletterSubscribe;

		

		@FindBy(xpath = "//input[@name='agree']")
		WebElement policyChkBox;

		@FindBy(xpath = "//button[@type='submit']")
		WebElement continueBtn;

		

		public void setFirstName(String fname) {
			firstName.sendKeys(fname);

		}

		public void setLastName(String lname) {
			lastName.sendKeys(lname);

		}

		public void setEmail(String email) {
			eMail.sendKeys(email);

		}

		

		public void setPassword(String pwd) {
			txtPassword.sendKeys(pwd);

		}

		

		

		public void setPrivacyPolicy() {
			//policyChkBox.submit();
			
			js.executeScript("arguments[0].click();",policyChkBox);

		}

		public void clickContinue() {
			 
			js.executeScript("arguments[0].click();",continueBtn)	;
			
			}
	}


