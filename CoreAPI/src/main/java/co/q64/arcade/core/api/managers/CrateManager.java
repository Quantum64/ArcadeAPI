package co.q64.arcade.core.api.managers;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.crate.CrateLibrary;
import co.q64.arcade.core.api.crate.CrateOpenExecutor;
import co.q64.arcade.core.api.crate.VirtualCrate;
import co.q64.arcade.core.api.objects.item.Item;

/**
 * The component that manages crates
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CrateManager extends Manager {
	/**
	 * Gets all currently registred crates
	 * @return the list of crates
	 */
	public List<CrateLibrary> getCrates();

	/**
	 * Unregister all crates
	 */
	public void clearCrates();

	/**
	 * Registers a crate, you should prefer to use the @Inject CrateRegistration instead
	 * @param crate the crate to register
	 */
	public void registerCrate(CrateLibrary crate);

	/**
	 * Gets a crate from its name and number
	 * @param name the name of the crate
	 * @param number the number of the crate
	 * @return the crate library, or null if none exists
	 */
	public CrateLibrary crateFromName(String name, int number);

	/**
	 * Opens the crate menu with the default series for player
	 * @param player who to open the menu for
	 */
	public void openMenu(BasePlayer player);

	/**
	 * Opens the crate menu with the given series for player
	 * @param player who to open the menu for
	 * @param series the crate series to open the menu for
	 */
	public void openMenu(BasePlayer player, String series);

	/**
	 * Gets the lore for a crate
	 * @param crateName the crate name
	 * @param crate the crate object
	 * @return the lore list
	 */
	public List<String> generateItemLore(String crateName, VirtualCrate crate, boolean real);

	/**
	 * Sets the executor that executes when a crate opens
	 * @param executor the new executor
	 */
	public void setCrateOpenExecutor(CrateOpenExecutor executor);

	/**
	 * Prints message in chat when a player finds an item
	 * @param player the player who unboxed the crate
	 * @param item the item they found
	 */
	public void doFoundEffect(BasePlayer player, Item item);
}