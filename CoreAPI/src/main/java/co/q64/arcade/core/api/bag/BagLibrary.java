package co.q64.arcade.core.api.bag;

import java.util.List;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a set of grab bags that should appear together with one theme
 * Implement this class, do not inject it
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface BagLibrary {
	/**
	 * Gets the list of grab bags included in this set
	 * @return the list of bags
	 */
	public List<Bag> getBags();

	/**
	 * Gets the icon that should be used in the cosmetics menu for this set
	 * @return the GUI icon
	 */
	public Material getIcon();

	/**
	 * Gets the name of this set, for the cosmetics menu
	 * @return the set name
	 */
	public String getName();

	/**
	 * Gets the slot the info item should appear in
	 * @return the info slot
	 */
	public int getInfoSlot();

	/**
	 * Gets the item stack that gives information about this set in the name and lore
	 * @return the info item
	 */
	public ItemStack getInfoItem();
}
