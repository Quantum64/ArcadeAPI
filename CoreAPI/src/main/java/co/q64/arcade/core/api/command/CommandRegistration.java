package co.q64.arcade.core.api.command;

/**
 * Allows command to be registered
 * @author Dylan
 *
 */
public interface CommandRegistration {
	/**
	 * Adds a command to the base registry
	 * @param c the command to add
	 */
	public void addPrimaryCommand(CommandProcessor c);
}
