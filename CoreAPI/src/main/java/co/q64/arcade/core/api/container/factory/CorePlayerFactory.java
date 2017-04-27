package co.q64.arcade.core.api.container.factory;

import java.util.UUID;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.container.factory.BasePlayerFactory;
import co.q64.arcade.core.api.container.CorePlayer;

public interface CorePlayerFactory extends BasePlayerFactory {
	public CorePlayer getPlayer(UUID player);
	
	public CorePlayer getPlayer(String player);
	
	public CorePlayer getPlayer(Player player);
}
