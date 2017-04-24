package co.q64.arcade.core.api.implementable;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface SelectMenuExecutor {
	public void onItemSelect(Player p, ItemStack item);

	public void onBack(Player p);
}
