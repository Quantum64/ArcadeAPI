package co.q64.arcade.core.api.util;

import co.q64.arcade.core.api.craft.CraftExecutor;
import co.q64.arcade.core.api.craft.CraftTemplate;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

/**
 * A registry that stores crafting recipes for the cosmetics crafting system
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CraftingRegistration {

	/**
	 * Adds a recipe to this registry, which takes input items and produces an output item
	 * @param exec the recipe to add
	 */
	public void registerRecipe(CraftExecutor exec);

	/**
	 * Adds a template which specifies how many addition slots an input item should provide
	 * @param temp the template to add
	 */
	public void registerTemplate(CraftTemplate temp);
}
