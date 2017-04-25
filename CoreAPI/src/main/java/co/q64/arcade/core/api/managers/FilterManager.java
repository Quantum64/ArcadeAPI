package co.q64.arcade.core.api.managers;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.filter.FilterMenu;
import co.q64.arcade.core.api.filter.FilterMenuCallback;
import co.q64.arcade.core.api.filter.ItemFilter;

@Injectable
@Global
public interface FilterManager extends Manager {
	public void applyFilter(BasePlayer p, ItemFilter filter);

	public void removeFilter(BasePlayer p, ItemFilter filter);

	public void clearFilters(BasePlayer p);

	public List<ItemFilter> getActiveFilters(BasePlayer p);

	public <T> List<T> getActiveFilters(BasePlayer p, Class<T> clazz);

	public void openFilterMenu(BasePlayer p, FilterMenu type, FilterMenuCallback callback, boolean one);

	public void openFullFilterMenu(BasePlayer p, FilterMenu type, FilterMenuCallback callback, boolean one);
}