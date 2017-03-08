package co.q64.arcade.core.api.managers;

import javax.inject.Inject;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a stateless subsystem of this component
 * @author Dylan
 *
 */
@Noinject
public interface Manager {
	/**
	 * An injected method that is used to complete the initialization of the manager after its construction.
	 */
	@Inject
	public void enable();
}
