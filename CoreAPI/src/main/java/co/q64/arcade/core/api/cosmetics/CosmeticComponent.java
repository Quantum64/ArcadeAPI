package co.q64.arcade.core.api.cosmetics;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BaseItemStack;
import co.q64.arcade.base.api.container.BasePlayer;

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
	public BaseItemStack getIcon();

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
	public void openMenu(BasePlayer player);

	/**
	 * Removes this cosmetic from being active on the given player
	 * @param player the player to clear
	 */
	public void clear(BasePlayer player);

	/**
	 * Disables this component for the given player
	 * @param player the player to disable the component for
	 */
	public void disable(BasePlayer player);

	/**
	 * Enables this component for the given player
	 * @param player the player to enable the compoent for
	 */
	public void enable(BasePlayer player);
}
