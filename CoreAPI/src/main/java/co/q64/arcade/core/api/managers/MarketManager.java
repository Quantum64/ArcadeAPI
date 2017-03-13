package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

@Injectable
@Global
public interface MarketManager extends Manager {
	public void openMenu(Player p, boolean clearFilters);

	public boolean init();
}