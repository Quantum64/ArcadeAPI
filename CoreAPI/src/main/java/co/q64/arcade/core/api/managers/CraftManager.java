package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.craft.CraftExecutor;
import co.q64.arcade.core.api.craft.CraftTemplate;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

/**
 * Central component for arcade's crafting system
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CraftManager extends Manager {
	/**
	 * Opens the crafting GUI for a player
	 * @param player the player to open the GUI for
	 */
	public void openMenu(Player player);

	/**
	 * Adds a crafting executor on demand
	 * Use a multibinder if possible
	 * @param executor the executor to add
	 */
	public void registerRecipe(CraftExecutor executor);

	/**
	 * Adds a crafting template on demand
	 * Use a multibinder is possible
	 * @param template the template to add
	 */
	public void addTemplate(CraftTemplate template);
}