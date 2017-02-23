package co.q64.arcade.core.api.executor;

/**
 * An executable object which accepts handlers for use with an executor
 * @author Dylan
 *
 * @param <T> the argument for use with this executable
 */
public interface Executable<T extends ArgumentMap> {
	/**
	 * Gets the human readable name of this
	 * @return
	 */
	public String getName();
	
	public void call(T args);
	
	public void registerHandler(Handler<T> handler);
}
