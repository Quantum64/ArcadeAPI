package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.implementable.SelectItemExecutor;
import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.core.api.objects.item.factory.ItemConstructor;
import co.q64.arcade.core.api.objects.item.factory.ItemDeserializer;
import co.q64.arcade.core.api.quality.Quality;

@Injectable
@Global
public interface ItemManager extends Manager {
	public void registerItem(String type, Class<? extends Item> clazz, ItemDeserializer id, ItemConstructor ic);

	public void registerQuality(Quality quality);
	
	public void openMenu(BasePlayer p, boolean clearFilters, boolean collapse);

	public void openSelectMenu(BasePlayer p, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openSelectFrom(BasePlayer p, BasePlayer target, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openView(BasePlayer p, BasePlayer target, boolean clearFilters, boolean collapse);
}