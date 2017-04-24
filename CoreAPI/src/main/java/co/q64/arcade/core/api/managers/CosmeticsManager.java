package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.foundation.api.managers.Manager;
import co.q64.arcade.core.api.cosmetics.CosmeticComponent;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

/**
 * Component of arcade that manages the main cosmetics menu and
 * used to collect all the CosmeticComponents but those can
 * be injected now
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CosmeticsManager extends Manager {
	/**
	 * Opens the main cosmetics meny for a player
	 * @param player the player to open the menu for
	 */
	public void open(Player player);

	/**
	 * You should be regestering your components using a multibinder and you better
	 * have a really good reason for doing this on demand if you want to use this
	 * @param component the component to register
	 */
	@Deprecated
	public void register(CosmeticComponent component);

	/**
	 * Gets a cosmetic component from its class, same as
	 * using @Inject YourComponent
	 * @param clazz the component class get the instance for
	 * @return the instance of this component
	 */
	public <T> T getComponent(Class<T> clazz);

	/**
	 * Disables a cosmetic component server wide
	 * @param clazz the component class to disable
	 */
	public void disable(Class<? extends CosmeticComponent> clazz);

	/**
	 * Enables a cosmetic component server wide
	 * @param clazz the component class to enable
	 */
	public void enable(Class<? extends CosmeticComponent> clazz);

	/**
	 * Gets if a component is currently disabled
	 * @param clazz the component class
	 * @return if the component is disabled
	 */
	public boolean isDisabled(Class<? extends CosmeticComponent> clazz);
}