package co.q64.arcade.core.api.chat;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.DATA)
public interface ChatComponent {
	public ChatExecutor getExecutor();

	public int getPriority();

	public String getId();

	public ChatComponentType getType();
}
