package co.q64.arcade.core.api.managers;

import java.util.List;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.implementable.SelectMenuExecutor;

@Injectable
@Global
public interface MenuManager extends Manager {
	public void openMenu(Player player, String name, List<ItemStack> items, boolean close, SelectMenuExecutor executor);
}
