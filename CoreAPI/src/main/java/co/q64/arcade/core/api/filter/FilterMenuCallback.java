package co.q64.arcade.core.api.filter;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface FilterMenuCallback {
	public void menuClose(Player p);
}
