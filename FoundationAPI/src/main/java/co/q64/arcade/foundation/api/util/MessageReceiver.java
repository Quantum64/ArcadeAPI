package co.q64.arcade.foundation.api.util;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject
public interface MessageReceiver {
	public void sendMessage(String message);
}
