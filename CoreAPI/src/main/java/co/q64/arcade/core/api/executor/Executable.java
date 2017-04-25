package co.q64.arcade.core.api.executor;

import co.q64.arcade.base.api.annotation.inject.Noinject;

/**
 * An executable object which accepts handlers for use with an executor
 * @author Dylan
 *
 * @param <T> the argument for use with this executable
 */
@Noinject(reason = Noinject.DATA)
public interface Executable<T extends ArgumentMap> {
	/**
	 * Calls the executalbe with a given argument map
	 * @param args
	 */
	public void call(T args);
	
	/**
	 * Registeres a handler 
	 * @param handler
	 */
	public void registerHandler(Handler<T> handler);
}
