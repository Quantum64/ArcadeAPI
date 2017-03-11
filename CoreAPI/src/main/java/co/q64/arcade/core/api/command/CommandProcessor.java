package co.q64.arcade.core.api.command;

import java.util.List;

import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.annotation.Noinject;
import co.q64.arcade.core.api.perm.Group;

/**
 * Command processor for handling arcade style commands
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.IMPLEMENT)
public interface CommandProcessor {
	/**
	 * We do not currently provide a public command hander API for adding arcade style commands,
	 * but you could make your own if you want, then register your commands in our multibinder
	 * @param processor the command processor to add
	 */
	public void registerMod(CommandProcessor processor);
	
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

	/**
	 * Gets the name of the command
	 * @return command name
	 */
	public String getName();

	/**
	 * Gets the group required to use this command
	 * @return the command group
	 */
	public Group getGroup();

	/**
	 * Override this to allow command execution with array args
	 * @param sender the command sender
	 * @param args the command arguments
	 */
	public default void execute(CommandSender sender, String[] args) {}

	/**
	 * Override this to allow command execution with list args
	 * @param sender the command sender
	 * @param args the command arguments
	 */
	public default void execute(CommandSender sender, List<String> args) {}

	/**
	 * Override this to allow command execution with no args
	 * @param sender the command sender
	 */
	public default void execute(CommandSender sender) {}
}
