package co.q64.arcade.core.api.crate;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Noinject;

/**
 * Allows crates to be registered
 * @author Dylan
 *
 */
@Noinject
@Global
public interface CrateRegistration {
	public void register(CrateLibrary crate);
}
