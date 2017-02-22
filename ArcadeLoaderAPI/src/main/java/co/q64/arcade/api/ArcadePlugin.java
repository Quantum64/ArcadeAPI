package co.q64.arcade.api;

/**
 * Represents the setup class for arcade modules
 * @author Dylan
 *
 */
public interface ArcadePlugin {
	/**
	 * All setup should happen here
	 * @param game the module object
	 */
	public void enable(ArcadeInit game);

	/**
	 * Disables the module
	 */
	public void disable();
}
