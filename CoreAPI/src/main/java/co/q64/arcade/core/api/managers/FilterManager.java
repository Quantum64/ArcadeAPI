package co.q64.arcade.core.api.managers;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.filter.FilterMenu;
import co.q64.arcade.core.api.filter.FilterMenuCallback;
import co.q64.arcade.core.api.filter.ItemFilter;

@Injectable
@Global
public interface FilterManager extends Manager {
	public void applyFilter(Player p, ItemFilter filter);

	public void removeFilter(Player p, ItemFilter filter);

	public void clearFilters(Player p);

	public List<ItemFilter> getActiveFilters(Player p);

	public <T> List<T> getActiveFilters(Player p, Class<T> clazz);

	public void openFilterMenu(Player p, FilterMenu type, FilterMenuCallback callback, boolean one);

	public void openFullFilterMenu(Player p, FilterMenu type, FilterMenuCallback callback, boolean one);
}