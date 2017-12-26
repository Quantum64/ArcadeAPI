package co.q64.arcade.core.api.util.chat;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
public interface ChatPrefixUtil {
	public String getPrefix(Player player);

	public String getPrefixNoLvl(Player player);
}
