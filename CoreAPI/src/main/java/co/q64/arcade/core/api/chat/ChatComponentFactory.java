package co.q64.arcade.core.api.chat;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

@Global
@Injectable
public interface ChatComponentFactory {
	public ChatComponent get(String id, int priority, ChatComponentType type, ChatExecutor executor);
}
