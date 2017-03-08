package co.q64.arcade.core.api.command;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Allows command to be registered
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CommandRegistration {
	/**
	 * Adds a command to the base registry
	 * @param c the command to add
	 */
	public void addPrimaryCommand(CommandProcessor c);
}
