package co.q64.arcade.base.api.util.message;

import java.util.UUID;

public interface MessageReceiver {
	public void sendMessage(String message);

	public String getName();
	
	public UUID getUniqueId();
	
	public MessageReceiverType getReceiverType();
}
