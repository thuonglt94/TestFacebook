package builder;

import detail.ChatDetail;

public class ChatDetailBuilder {
	private String formChat;

	public ChatDetailBuilder withFormChat(String formChat) {
		this.formChat = formChat;
		return this;
	}

	public ChatDetail chatbuild() {
		return new ChatDetail(formChat);
	}

}
