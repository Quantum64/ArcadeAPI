
package co.q64.arcade.core.api.executor;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

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
	public void register(Executor<?> e);
}
