package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.implementable.SelectItemExecutor;
import co.q64.arcade.core.api.quality.Quality;

@Injectable
@Global
public interface ItemManager extends Manager {
	public void registerQuality(Quality quality);
	
	public void openMenu(Player p, boolean clearFilters, boolean collapse);

	public void openSelectMenu(Player p, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openSelectFrom(Player p, Player target, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openView(Player p, Player target, boolean clearFilters, boolean collapse);
}