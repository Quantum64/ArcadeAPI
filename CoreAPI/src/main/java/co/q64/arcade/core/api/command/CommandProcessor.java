package co.q64.arcade.core.api.command;

import java.util.List;

import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.perm.Group;

public interface CommandProcessor {
	/**
	 * We do not currently provide a public command hander API for adding arcade style commands,
	 * but you could make your own if you want, the register your commands in our multibinder
	 * @param processor the command processor to add
	 */
	public void registerMod(CommandProcessor processor);
	
	public void doExecution(CommandSender sender, String command, String[] args);

	public void doExecution(CommandSender sender, String command, String args);

	public String getName();

	public Group getGroup();

	public default void execute(CommandSender sender, String[] args) {}

	public default void execute(CommandSender sender, List<String> args) {}

	public default void execute(CommandSender sender) {}
}
