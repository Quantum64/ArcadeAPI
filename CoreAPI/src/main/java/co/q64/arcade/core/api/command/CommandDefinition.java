package co.q64.arcade.core.api.command;

import java.util.List;

import org.bukkit.command.CommandSender;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.util.message.MessageReceiver;
import co.q64.arcade.core.api.perm.DefaultGroups;
import co.q64.arcade.core.api.perm.Group;

@Noinject(reason = Noinject.IMPLEMENT)
public interface CommandDefinition {
	/**
	 * Gets the group required to use this command
	 * @return the command group
	 */
	public default Group getGroup() {
		return DefaultGroups.DEFAULT;
	}

	/**
	 * Override this to allow command execution with array args
	 * @param sender the command sender
	 * @param args the command arguments
	 */
	public default void execute(MessageReceiver sender, String[] args) {}

	/**
	 * Override this to allow command execution with list args
	 * @param sender the command sender
	 * @param args the command arguments
	 */
	public default void execute(MessageReceiver sender, List<String> args) {}

	/**
	 * Override this to allow command execution with no args
	 * @param sender the command sender
	 */
	public default void execute(MessageReceiver sender) {}

	public default int execute(CommandSender sender, String[] args) {return 0;}

	public default int execute(CommandSender sender, List<String> args) {return 0;}

	public default int execute(CommandSender sender) {return 0;}
	
	public String getName();
}
