package event;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import detail.ChatDetail;
import detail.LogInDetail;
import detail.SearchDetail;
import pages.ChatPage;
import pages.LogInPage;
import pages.LogoutPage;
import pages.SearchPage;
import until.WaitFor;

public class FacebookEvent {
	WebDriver driver;
	LogInDetail logindetai;
	SearchDetail searchdetail;
	ChatDetail chatdetail;

	LogInPage logInPage;
	SearchPage searchPage;
	ChatPage chatPage;
	LogoutPage logoutPage;

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
		waiForLoginFormToAppear();
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
		waitForSearchTextBoxToAppear();
		searchPage.enterSearchTextbox(searchdetail.getSearch());
		searchPage.clickSearchButton();
		waitForSearchResultToAppear();
	}

	public void navigateChat() {
		chatPage = new ChatPage(driver);
	}

	public void ChatFriend() {
		chatPage.clickFriendChatButton();
		chatPage.enterFormChatTextbox(chatdetail.getFormChat());
	}

	public void navigateLogout() {
		logoutPage = new LogoutPage(driver);
	}

	public void Logout(){
		logoutPage.clickOptionButton();
		waitForLogoutButtonToAppear();
		logoutPage.clickLogoutButton();
	}

	private void waiForLoginFormToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.id("email"));

	}

	private void waitForSearchTextBoxToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.id("q"));

	}

	private void waitForSearchResultToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector(".clearfix._3m__"));

	}

	private void waitForLogoutButtonToAppear() {
		// TODO Auto-generated method stub
		new WaitFor(driver).presenceOfTheElement(By.cssSelector("._54nf li:nth-child(12)"));

	}

	// private void waitForCloseButtonHidden() {
	// // TODO Auto-generated method stub
	// new
	// WaitFor(driver).hiddenOfTheElement(By.cssSelector(".ui-dialog-titlebar-close"));
	// }

}
