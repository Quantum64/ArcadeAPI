package co.q64.arcade.core.api.command;

import org.bukkit.command.CommandSender;

import co.q64.arcade.base.api.annotation.inject.Noinject;

/**
 * Command processor for handling arcade style commands
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CommandProcessor {
	/**
	 * Executes the command with the given args or passes the command to a mod
	 * @param sender the command sender
	 * @param command the command to execute
	 * @param args args or subcommands
	 */
	public void doExecution(CommandSender sender, String command, String[] args);

	/**
	 * Executes the command with the given arg or passes the command to a mod
	 * @param sender the command sender
	 * @param command the command to execute
	 * @param args argument or subcommand
	 */
	public void doExecution(CommandSender sender, String command, String args);

	public CommandDefinition getDefinition();

	public CommandDefinition getParent();
}
