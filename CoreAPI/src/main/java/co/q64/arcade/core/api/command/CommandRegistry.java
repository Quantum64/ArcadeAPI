package co.q64.arcade.core.api.command;

import java.util.List;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

/**
 * Allows command to be registered
 * @author Dylan
 *
 */
@Injectable
@Global
public interface CommandRegistry {
	/**
	 * Adds a command to the base registry
	 * @param c the command to add
	 */
	public void addCommand(CommandDefinition definition);

	public void addModule(CommandDefinition parent, CommandDefinition command);

	public List<CommandProcessor> getCommands();
}
