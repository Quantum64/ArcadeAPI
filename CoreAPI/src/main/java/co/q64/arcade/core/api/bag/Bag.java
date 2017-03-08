package co.q64.arcade.core.api.bag;

import java.util.List;

import co.q64.arcade.core.api.annotation.Noinject;
import co.q64.arcade.core.api.item.ArcadeItem;

/**
 * Represents a grab bag that can be opened by players and drops items
 * Implement this class, do not inject it
 * @author Dylan
 *
 */
@Noinject
public interface Bag {
	/**
	 * Gets the slot for this bag in the GUI
	 * @return the GUI slot
	 */
	public int getSlot();

	/**
	 * Gets a random item this bag should drop
	 * @return the dropped item
	 */
	public ArcadeItem getItem();
	
	/**
	 * Gets the lore of the bag for the GUI
	 * @return the lore for the GUI item
	 */
	public List<String> getLore();

	/**
	 * Gets the name of the bag for the GUI
	 * @return the GUI name for the bag
	 */
	public String getName();

	/**
	 * Gets the cost to open this bag
	 * Grab bags always cost credits
	 * @return the cost of the bag
	 */
	public int getCost();
}
	