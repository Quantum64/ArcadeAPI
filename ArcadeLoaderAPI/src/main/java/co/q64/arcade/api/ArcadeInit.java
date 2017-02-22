package co.q64.arcade.api;

import co.q64.arcade.api.inject.AbstractArcadeModule;

/**
 * The init class for the module
 * @author Dylan
 *
 */
public interface ArcadeInit {
	/**
	 * Calls the setup class enable on an injected object
	 */
	public void onEnable();

	/**
	 * Calls the setup class disable on an injected object
	 */
	public void onDisable();

	/**
	 * Gets the module requirements for the module
	 * @return the arcade module
	 */
	public AbstractArcadeModule require();
}
