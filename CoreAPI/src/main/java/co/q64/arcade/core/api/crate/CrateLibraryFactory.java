package co.q64.arcade.core.api.crate;

import org.bukkit.Material;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Create crate libraries
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CrateLibraryFactory {
	/**
	 * Creates a new crate library
	 * @param name crate name
	 * @param number crate number
	 * @param item the item to represent this crate in menus
	 * @param crate the executor to generate crate items
	 * @param dropped should this crate be dropped by the server
	 * @return the new crate library
	 */
	public CrateLibrary create(@Assisted("name") String name, int number, Material item, VirtualCrate crate, boolean dropped);

	/**
	 * 
	 * {@inheritDoc CrateLibraryFactory#create(String, int, Material, CrateBase, boolean)}
	 * @param dropMod float from 0 to 1 for reducing the chances for this crate to be dropped
	 */
	public CrateLibrary create(@Assisted("name") String name, int number, Material item, VirtualCrate crate, boolean dropped, float dropMod);

	/**
	 * 
	 * {@inheritDoc CrateLibraryFactory#create(String, int, Material, CrateBase, boolean, float)}
	 * @param series the crate series, which decides which menu this crate will be placed in
	 */
	public CrateLibrary create(@Assisted("name") String name, int number, Material item, VirtualCrate crate, boolean dropped, float dropMod, @Assisted("series") String series);
}
