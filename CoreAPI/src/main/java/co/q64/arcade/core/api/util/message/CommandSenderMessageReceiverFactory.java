package co.q64.arcade.core.api.util.message;

import org.bukkit.command.CommandSender;

import co.q64.arcade.foundation.api.util.message.MessageReceiver;

public interface CommandSenderMessageReceiverFactory {
	public MessageReceiver create(CommandSender sender);
}
