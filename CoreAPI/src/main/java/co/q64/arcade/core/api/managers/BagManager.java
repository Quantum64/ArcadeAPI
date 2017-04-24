package co.q64.arcade.core.api.managers;

import org.bukkit.Material;
import org.bukkit.entity.Player;

import co.q64.arcade.core.api.bag.BagLibrary;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

/**
 * System for setting up grab bags, which are limited time crates that
 * players can open for exclusive items.  They are different from crates
 * because once they are removed there is no way to open them again,
 * this is also useful because it is possible to remove them without
 * breaking everyone's inventories, where you can't do that with crates.
 * They are usually used for holiday themed cosmetics.
 * @author Dylan
 *
 */
@Injectable
@Global
public interface BagManager extends Manager {
	/**
	 * Opens the grab bag menu for the player
	 * @param player the player to open the menu for
	 */
	public void openMenu(Player player);

	/**
	 * Sets the current set of grab bags that can be opened
	 * @param library the bag library
	 */
	public void setBagLibrary(BagLibrary library);

	/**
	 * Gets the icon that should be displayed in the cosmetics menu
	 * @return the icon
	 */
	public Material getIconMaterial();

	/**
	 * Gets the name of the current grab bag selection
	 * @return the current name
	 */
	public String getName();
}