package co.q64.arcade.base.api.container;

import java.util.UUID;

import co.q64.arcade.base.api.util.message.MessageReceiver;

public interface BasePlayer extends MessageReceiver {
	public String getName();
	
	public UUID getUniqueId();
}
