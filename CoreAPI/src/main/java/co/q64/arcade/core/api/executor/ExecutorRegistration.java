
package co.q64.arcade.core.api.executor;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;

/**
 * Allows executors to be registered
 * @author Dylan
 *
 */
@Injectable
@Global
public interface ExecutorRegistration {
	/**
	 * Adds an executor to the executor registration
	 * @param e the executor to add
	 */
	public void register(Class<? extends Executor<?>> e);
}
