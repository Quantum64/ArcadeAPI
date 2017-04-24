package co.q64.arcade.core.api.util.player;

import java.util.UUID;

import javax.inject.Inject;
import javax.inject.Singleton;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

import co.q64.arcade.foundation.api.util.player.KickPlayer;

@Singleton
public class SimpleKickPlayer implements KickPlayer {
	private @Inject Plugin plugin;

	@Override
	public void kickPlayer(UUID player, String message) {
		Bukkit.getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {

			@Override
			public void run() {
				Player p = Bukkit.getPlayer(player);
				if (p != null) {
					p.kickPlayer(message);
				}
			}
		});
	}
}
