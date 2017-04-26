package co.q64.arcade.core.api.managers;

import java.util.concurrent.Future;

import org.bukkit.command.CommandSender;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;

@Injectable
@Global
public interface InfractionManager extends Manager {
	public void warn(BasePlayer p, CommandSender cs, String reason);

	public void info(String playerName, CommandSender cs);

	public void warnMessage(CommandSender cs, BasePlayer p, String reason, boolean chat);

	public boolean kick(BasePlayer p, String argName, CommandSender cs, String reason, boolean inc);

	public boolean messageAllowed(BasePlayer p, String message);

	public void filterMessage(BasePlayer p, String message);

	public Future<?> tempmute(String p, CommandSender cs, long endTime, String reason);

	public Future<?> mute(String p, CommandSender cs, String reason);

	public Future<?> unmute(String p, CommandSender cs);

	public Future<?> ban(String player, CommandSender sender, String reason, long banTime, long bannedUntil);

	public Future<?> unban(String player, CommandSender sender);

	public Future<?> tradeban(String player, CommandSender sender, long banTime);
}