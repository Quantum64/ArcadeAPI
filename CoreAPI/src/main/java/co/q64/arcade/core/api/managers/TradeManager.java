package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.foundation.api.managers.Manager;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface TradeManager extends Manager {
	public void openMenu(Player p);

	public boolean canTrade(Player p);

	public void openSession(Player p, Player l);

	public void resumeSession(Player p);
}