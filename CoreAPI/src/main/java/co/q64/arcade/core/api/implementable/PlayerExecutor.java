package co.q64.arcade.core.api.implementable;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface PlayerExecutor {
	public void execute(Player p);
}
