package co.q64.arcade.core.api.crate;

import co.q64.arcade.base.api.annotation.inject.Injectable;

/**
 * Registers default crates for this module
 * @author Dylan
 *
 */
@Injectable
public interface DefaultCrateRegistration {
	/**
	 * Adds the default crates to the crate register for this module
	 */
	public void enable();
}
