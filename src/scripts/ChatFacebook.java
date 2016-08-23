package scripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import builder.ChatDetailBuilder;
import builder.LogInDetailBuilder;
import builder.SearchDetailBuilder;
import detail.ChatDetail;
import detail.LogInDetail;
import detail.SearchDetail;
import event.FacebookEvent;
import until.PropertiesStore;

@Test
public class ChatFacebook extends ScriptBase {
	public void test_Chat() throws InterruptedException, IOException {
		LogInDetailBuilder logindetailbuilder = new LogInDetailBuilder();
		SearchDetailBuilder searchdetailbuilder = new SearchDetailBuilder();
		ChatDetailBuilder chatdatailbuilder = new ChatDetailBuilder();

		logindetailbuilder.withEmail(PropertiesStore.getProperty("email")).withPass(PropertiesStore.getProperty("password"));
		searchdetailbuilder.withSearch("ngọc thương");
		chatdatailbuilder.withFormChat(PropertiesStore.getProperty("message"));

		LogInDetail logindetail = logindetailbuilder.loginbuild();
		SearchDetail searchdetail = searchdetailbuilder.searchbuild();
		ChatDetail chatdetail = chatdatailbuilder.chatbuild();
	//	Assert.assertEquals(true, false);
		
		FacebookEvent user = new FacebookEvent(driver, logindetail, searchdetail, chatdetail);

	
		
		given(user).navigateLogInForm();
		and(user).logIn(logindetail);
		and(user).navigateSearch();
		when(user).searchFriend();
		and(user).navigateChat();
		when(user).ChatFriend();
		// and(user).navigateLogout();
		// then(user).Logout();
	}
}
