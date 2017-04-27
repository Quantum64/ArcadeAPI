package co.q64.arcade.base.api.command;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.perm.DefaultGroups;
import co.q64.arcade.base.api.perm.Group;
import co.q64.arcade.base.api.util.message.MessageReceiver;

@Noinject(reason = Noinject.IMPLEMENT)
public interface BaseCommandDefinition extends VirtualCommandDefinition {
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
}
