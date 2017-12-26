package co.q64.arcade.core.api.managers;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.chat.ChatComponent;

@Deprecated
public interface ChatManager extends Manager {
	public String format(Player player, String message);

	public List<ChatComponent> getComponents();
}
