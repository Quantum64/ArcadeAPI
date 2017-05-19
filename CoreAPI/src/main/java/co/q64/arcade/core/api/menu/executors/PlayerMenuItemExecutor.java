package co.q64.arcade.core.api.menu.executors;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.menu.MenuItem;

@FunctionalInterface
public interface PlayerMenuItemExecutor {
	public void execute(Player player, MenuItem item);
}
