package co.q64.arcade.core.api.crate;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.item.ArcadeItem;

/**
 * Represents an implementable object for getting information about a crate
 * @author Dylan
 *
 */
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
	public ArcadeItem openCrate(Player p);
}
