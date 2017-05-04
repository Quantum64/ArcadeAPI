package co.q64.arcade.base.api.managers;

import java.util.concurrent.Future;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.util.message.MessageReceiver;

@Injectable
@Global
public interface InfractionManager extends Manager {
	public void warn(BasePlayer p, MessageReceiver cs, String reason);

	public void info(String playerName, MessageReceiver cs);

	public void warnMessage(MessageReceiver cs, BasePlayer p, String reason, boolean chat);
	
	public void enableFilter();

	public boolean kick(BasePlayer p, String argName, MessageReceiver cs, String reason, boolean inc);

	public boolean messageAllowed(BasePlayer p, String message);

	public void filterMessage(BasePlayer p, String message);

	public Future<?> tempmute(String p, MessageReceiver cs, long endTime, String reason);

	public Future<?> mute(String p, MessageReceiver cs, String reason);

	public Future<?> unmute(String p, MessageReceiver cs);

	public Future<?> ban(String player, MessageReceiver sender, String reason, long banTime, long bannedUntil);

	public Future<?> unban(String player, MessageReceiver sender);

	public Future<?> tradeban(String player, MessageReceiver sender, long banTime);
}