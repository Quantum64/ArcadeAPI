package co.q64.arcade.core.api.util;

import org.bukkit.event.Listener;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;


/**
 * A utility object that accepts and automatically registered listeners
 * @author Dylan
 *
 */
@Injectable
@Global
public interface ListenerRegistration {
	/**
	 * Queues a listener to be registered.
	 *
	 * If the plugin is enabled, the listener is registered instantly, but if the plugin is not
	 * enabled, listeners are queued until {@link #onEnable() onEnable} is called
	 * @param listener the listener to be registered
	 */
	public void register(Listener listener);

	/**
	 * Called once when the plugin is enabled to dequeue any outstanding listener registration requests
	 */
	public void onEnable();
}
