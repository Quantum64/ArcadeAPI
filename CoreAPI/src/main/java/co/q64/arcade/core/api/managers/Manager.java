package co.q64.arcade.core.api.managers;

import javax.inject.Inject;

/**
 * Represents a stateless subsystem of this component
 * @author Dylan
 *
 */
public interface Manager {
	/**
	 * An injected method that is used to complete the initialization of the manager after its construction.
	 */
	@Inject
	public void enable();
}
