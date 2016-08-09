package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
WebDriver driver;

	
	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(css = "#q")
	private WebElement txtSearch;
	
	@FindBy(css = ".reDesignedBtn")
	private WebElement btnSearch;
	
	public void enterSearchTextbox(String text) {
		txtSearch.clear();
		txtSearch.sendKeys(text);
		
	}
	
	public void clickSearchButton() {
		btnSearch.click();
	}
}
