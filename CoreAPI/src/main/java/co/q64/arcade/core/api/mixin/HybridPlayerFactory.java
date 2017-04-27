package co.q64.arcade.core.api.mixin;

import java.util.UUID;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.container.CorePlayer;

public interface HybridPlayerFactory {
	public HybridPlayer getPlayer(CorePlayer player);
	
	public HybridPlayer getPlayer(Player player);
	
	public HybridPlayer getPlayer(UUID player);
	
	public HybridPlayer getPlayer(String player);
}
