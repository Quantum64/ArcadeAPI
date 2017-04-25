package co.q64.arcade.core.api.craft;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.objects.item.Item;

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
	public Integer getApplyItemsSlots(Item in);
}
