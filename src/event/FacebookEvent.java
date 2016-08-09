package event;

import org.openqa.selenium.WebDriver;

import detail.ChatDetail;
import detail.LogInDetail;
import detail.SearchDetail;
import pages.ChatPage;
import pages.LogInPage;
import pages.SearchPage;

public class FacebookEvent {
	WebDriver driver;
	LogInDetail logindetai;
	SearchDetail searchdetail;
	ChatDetail chatdetail;

	LogInPage logInPage;
	SearchPage searchPage;
	ChatPage chatPage;

	public FacebookEvent(WebDriver driver, LogInDetail loginDetail, SearchDetail searchDetail, ChatDetail chatDetail) {
		this.driver = driver;
		this.logindetai = loginDetail;
		this.searchdetail = searchDetail;
		this.chatdetail = chatDetail;

	}

	public FacebookEvent(WebDriver driver) {
		this.driver = driver;
	}

	public void navigateLogInForm() {
		logInPage = new LogInPage(driver);

	}

	public void logIn(LogInDetail logindetai) {
		logInPage.enterEmailTextbox(logindetai.getEmail());
		logInPage.enterPasswordTextbox(logindetai.getPass());
		logInPage.clickLoginButton();
	}

	public void navigateSearch() {
		searchPage = new SearchPage(driver);
	}

	public void searchFriend() {
		searchPage.enterSearchTextbox(searchdetail.getSearch());
		searchPage.clickSearchButton();

	}

	public void navigateChat() {
		chatPage = new ChatPage(driver);
	}
	
	public void ChatFriend() {
		chatPage.clickFriendChatButton();
		chatPage.enterFormChatTextbox(chatdetail.getFormChat());

	}


}
