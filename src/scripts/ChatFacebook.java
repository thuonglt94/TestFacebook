package scripts;

import org.testng.annotations.Test;

import builder.ChatDetailBuilder;
import builder.LogInDetailBuilder;
import builder.SearchDetailBuilder;
import detail.ChatDetail;
import detail.LogInDetail;
import detail.SearchDetail;
import event.FacebookEvent;

@Test
public class ChatFacebook extends ScriptBase {
	public void test_Chat() throws InterruptedException {
		LogInDetailBuilder logindetailbuilder = new LogInDetailBuilder();
		SearchDetailBuilder searchdetailbuilder = new SearchDetailBuilder();
		ChatDetailBuilder chatdatailbuilder = new ChatDetailBuilder();

		logindetailbuilder.withEmail("01295464616").withPass("ngocthuongbaby");
		searchdetailbuilder.withSearch("ngọc thương");
		chatdatailbuilder.withFormChat("hi. test chat facebook");

		LogInDetail logindetail = logindetailbuilder.loginbuild();
		SearchDetail searchdetail = searchdetailbuilder.searchbuild();
		ChatDetail chatdetail = chatdatailbuilder.chatbuild();

		FacebookEvent user = new FacebookEvent(driver, logindetail, searchdetail, chatdetail);

	
		
		given(user).navigateLogInForm();
		and(user).logIn(logindetail);
		and(user).navigateSearch();
		when(user).searchFriend();
		and(user).navigateChat();
		then(user).ChatFriend();

	}
}
