package co.q64.arcade.core.api.menu.executors;

import org.bukkit.entity.Player;

@FunctionalInterface
public interface MenuTickExecutor {
	public void execute(Player menu);
}
