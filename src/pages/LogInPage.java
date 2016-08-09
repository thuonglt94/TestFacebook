package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	WebDriver driver;
	public LogInPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(css = "#email")
	private WebElement txtEmail;
	
	@FindBy(css = "#pass")
	private WebElement txtPassword;
	
	@FindBy(css = ".uiButton.uiButtonConfirm")
	private WebElement btnLogin;
	
	public void enterEmailTextbox(String text) {
		txtEmail.clear();
		txtEmail.sendKeys(text);
		
	}
	
	public void enterPasswordTextbox(String text) {
		txtPassword.clear();
		txtPassword.sendKeys(text);
		
	}
	
	public void clickLoginButton() {
		btnLogin.click();
	}
	
	
	
}
