package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(xpath = "//input[@name='Email']")
	private WebElement emailTextField;
	
	@FindBy(xpath = "//input[@id='Password']")
	private WebElement passwordTextField;
	
	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginButton;
	
	@FindBy(xpath = "//a[text()='Forgot password?']")
	private WebElement forgotPasswordLink;
	
	@FindBy(xpath = "//label[text()='Remember me?']/..//input[@id='RememberMe']")
	private WebElement RememberMeCheckBox;
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmailTextField() {
		return emailTextField;
	}

	public WebElement getPasswordTextField() {
		return passwordTextField;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}

	public WebElement getRememberMeCheckBox() {
		return RememberMeCheckBox;
	}


	
	
	

}
