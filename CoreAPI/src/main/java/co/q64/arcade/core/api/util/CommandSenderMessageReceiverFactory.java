package co.q64.arcade.core.api.util;

import org.bukkit.command.CommandSender;

import co.q64.arcade.foundation.api.util.MessageReceiver;

public interface CommandSenderMessageReceiverFactory {
	public MessageReceiver create(CommandSender sender);
}
