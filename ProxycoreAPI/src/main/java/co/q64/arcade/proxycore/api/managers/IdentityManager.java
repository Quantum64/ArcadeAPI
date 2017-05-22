package co.q64.arcade.proxycore.api.managers;

import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.base.api.util.message.MessageReceiver;

public interface IdentityManager extends Manager {
	public void setUse(boolean use);

	public void discover(MessageReceiver cs, String name);

	public void ban(MessageReceiver cs, String name, String reason);
	
	public void unban(MessageReceiver cs, String name);
}
