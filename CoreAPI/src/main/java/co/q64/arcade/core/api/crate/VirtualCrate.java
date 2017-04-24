package co.q64.arcade.core.api.crate;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * Represents an implementable object for getting information about a crate
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface VirtualCrate {
	/**
	 * Gets the lore that should appear under a crate in the crates menu
	 * @return the crate lore
	 */
	public List<String> getLore();

	/**
	 * Gets an item from opening a crate
	 * @param p the player who opened the crate
	 * @return the item the crate produced
	 */
	public Item openCrate(Player p);
}
