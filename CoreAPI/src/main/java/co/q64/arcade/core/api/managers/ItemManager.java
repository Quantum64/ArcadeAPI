package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.implementable.SelectItemExecutor;
import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.core.api.objects.item.factory.ItemConstructor;
import co.q64.arcade.core.api.objects.item.factory.ItemDeserializer;
import co.q64.arcade.core.api.quality.Quality;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

@Injectable
@Global
public interface ItemManager extends Manager {
	public void registerItem(String type, Class<? extends Item> clazz, ItemDeserializer id, ItemConstructor ic);

	public void registerQuality(Quality quality);
	
	public void openMenu(Player p, boolean clearFilters, boolean collapse);

	public void openSelectMenu(Player p, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openSelectFrom(Player p, Player target, SelectItemExecutor exec, boolean clearFilters, boolean collapse);

	public void openView(Player p, Player target, boolean clearFilters, boolean collapse);
}