package co.q64.arcade.core.api.craft;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.core.api.objects.item.Item;

/**
 * Represents a crafting recipe for cosmetics crafting
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CraftExecutor {
	/**
	 * Takes input items and produces output items
	 * @param player the player using the crafting recipe
	 * @param in the initial item (index 0) and addition items (index 1+)
	 * @return the list of items as a result of this recipe, or null
	 */
	public List<Item> onItemCraft(BasePlayer player, List<Item> in);
}
