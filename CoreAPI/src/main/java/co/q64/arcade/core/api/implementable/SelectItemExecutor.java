package co.q64.arcade.core.api.implementable;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface SelectItemExecutor {
	public void onItemSelect(Player p, Item item);

	public void onBack(Player p);
}
