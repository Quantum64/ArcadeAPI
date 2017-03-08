package co.q64.arcade.core.api.crate;

import org.bukkit.Material;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a crate that is displayed in the crates menu
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface CrateLibrary {
	/**
	 * Gets the crate name
	 * @return the crate name
	 */
	public String getCrateName();

	/**
	 * Gets the crate number
	 * @return the crate number
	 */
	public int getCrateNumber();

	/**
	 * Gets the item to represent the crate in the crates menu
	 * @return the crate material
	 */
	public Material getCrateItem();

	/**
	 * Gets the virtual crate for generating items for this crate
	 * @return the virtual crate object
	 */
	public VirtualCrate getCrate();

	/**
	 * Gets if this crate is still dropped by the automatic crate drop timer
	 * @return is the crate is still dropped
	 */
	public boolean isDropped();
	
	/**
	 * Returns a float representing how often this crate should be dropped
	 * 1.0f is the maximum value and is the standard rate at which crates are dropped
	 * Numbers less than 1.0f will cause the crate to be dropped less frequently until
	 * 0.0f and below, where the crate can no longer drop
	 * @return the drop modifier for the crate
	 */
	public float getDropMod(); 
	
	/**
	 * Gets the crate series for which crate menu is should appear in,
	 * should return an empty string for the default crates menu
	 * @return the crate series
	 */
	public String getSeries();
}
