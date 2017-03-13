package co.q64.arcade.core.api.craft;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Noinject;
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
	public List<Item> onItemCraft(Player player, List<Item> in);
}
