package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;

	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = "#userNavigationLabel")
	private WebElement btnOption;

	@FindBy(css = "._54nf li:nth-child(12)")
	private WebElement btnLogout;

	public void clickOptionButton() {
		btnOption.click();
	}
	public void clickLogoutButton() {
		btnLogout.click();
	}
	
}
