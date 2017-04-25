package co.q64.arcade.base.api.container;

import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.util.message.MessageReceiver;

@Noinject
public interface BasePlayer extends MessageReceiver {
	public String getName();
	
	public UUID getUniqueId();
	
	public void openInventory(BaseInventory inventory);

	public void closeInventory();

	public BaseInventory getOpenInventory();

	public BaseInventory getInventory();
}
