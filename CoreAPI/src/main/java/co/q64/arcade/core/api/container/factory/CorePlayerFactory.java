package co.q64.arcade.core.api.container.factory;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.container.CorePlayer;

public interface CorePlayerFactory {
	public CorePlayer create(Player player);
}
