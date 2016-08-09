package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChatPage {
	WebDriver driver;

	public ChatPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(css = ".fbChatOrderedList.clearfix li:nth-child(1)")
	private WebElement btnFriendChat;

	@FindBy(css = "._1d4_")
	private WebElement txtFormChat;

	public void clickFriendChatButton() {
		btnFriendChat.click();
	}

	public void enterFormChatTextbox(String text) {
		txtFormChat.sendKeys(text);
		txtFormChat.sendKeys(Keys.ENTER);

	}

}
