package co.q64.arcade.core.api.cosmetics;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a cosmetic component that can appear in the
 * main cosmetics menu, this is usually attached to a selector
 * GUI
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CosmeticComponent {
	/**
	 * Gets the name of the component
	 * @return the component name
	 */
	public String getName();

	/**
	 * Gets the component icon as it should appear in the main
	 * cosmetics menu
	 * @return the component icon
	 */
	public ItemStack getIcon();

	/**
	 * Gets the slot this should appear in the main cosmetics menu
	 * @return the menu slot
	 */
	public int getSlot();

	/**
	 * Opens the menu for the cosmetic selector, you can implement
	 * this yourself or use the provided implementation CosmeticSelector
	 * from core
	 * @param player the player to open the menu for
	 */
	public void openMenu(Player player);

	/**
	 * Removes this cosmetic from being active on the given player
	 * @param player the player to clear
	 */
	public void clear(Player player);

	/**
	 * Disables this component for the given player
	 * @param player the player to disable the component for
	 */
	public void disable(Player player);

	/**
	 * Enables this component for the given player
	 * @param player the player to enable the compoent for
	 */
	public void enable(Player player);
}
