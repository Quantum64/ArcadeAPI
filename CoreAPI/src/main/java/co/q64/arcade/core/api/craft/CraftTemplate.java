package co.q64.arcade.core.api.craft;

import co.q64.arcade.core.api.annotation.Noinject;
import co.q64.arcade.core.api.item.ArcadeItem;

/**
 * Represents a template for use in crafting
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CraftTemplate {
	/**
	 * 
	 * @param in the initial item slot
	 * @return the number of addition slots that should be used for this item
	 */
	public Integer getApplyItemsSlots(ArcadeItem in);
}
