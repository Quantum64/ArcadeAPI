package co.q64.arcade.core.api.command;

import java.util.List;

import org.bukkit.command.CommandSender;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.command.VirtualCommandDefinition;

@Noinject(reason = Noinject.IMPLEMENT)
public interface CommandDefinition extends VirtualCommandDefinition {
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
