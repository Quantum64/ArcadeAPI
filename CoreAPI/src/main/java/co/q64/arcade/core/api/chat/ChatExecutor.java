package co.q64.arcade.core.api.chat;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface ChatExecutor {
	public String get(Player player);
}
