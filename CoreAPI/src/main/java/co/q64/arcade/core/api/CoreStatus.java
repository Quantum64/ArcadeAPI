package co.q64.arcade.core.api;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

/**
 * Status of the core module
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CoreStatus {
	/**
	 * Core module enable status
	 * @return if the core module is enabled
	 */
	public boolean isEnabled();
	
	/**
	 * Core module disabled status
	 * @return if the core module is disabled
	 */
	public boolean isDisabled();
	
	/**
	 * Checks if core was able to fully enable
	 * @return if the core is valid
	 */
	public boolean isValid();
}
