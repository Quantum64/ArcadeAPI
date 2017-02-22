
package co.q64.arcade.core.api.executor;

/**
 * Allows executors to be registered
 * @author Dylan
 *
 */
public interface ExecutorRegistration {
	/**
	 * Adds an executor to the executor registration
	 * @param e the executor to add
	 */
	public void register(Executor<?> e);
}
