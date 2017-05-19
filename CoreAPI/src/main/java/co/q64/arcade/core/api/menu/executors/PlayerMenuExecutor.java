package co.q64.arcade.core.api.menu.executors;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface PlayerMenuExecutor {
	public void execute(Player player);
}
