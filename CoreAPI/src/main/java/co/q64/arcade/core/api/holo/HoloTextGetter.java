package co.q64.arcade.core.api.holo;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface HoloTextGetter {
	public String getText(Player p);
}
