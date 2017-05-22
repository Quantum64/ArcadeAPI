package co.q64.arcade.proxycore.api.command;

import java.util.List;

import net.md_5.bungee.api.CommandSender;
import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.perm.DefaultGroups;
import co.q64.arcade.base.api.perm.Group;
import co.q64.arcade.base.api.util.message.MessageReceiver;

@Noinject(reason = Noinject.IMPLEMENT)
public interface CommandDefinition {
	public default void execute(CommandSender sender, String[] args) {}

	public default void execute(CommandSender sender, List<String> args) {}

	public default void execute(CommandSender sender) {}
	
	public default void execute(MessageReceiver sender, String[] args) {}

	public default void execute(MessageReceiver sender, List<String> args) {}

	public default void execute(MessageReceiver sender) {}

	public String getName();

	public default Group getGroup() {
		return DefaultGroups.DEFAULT;
	}
}
