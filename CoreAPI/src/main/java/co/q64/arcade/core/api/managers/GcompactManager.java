package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.gcompact.UnusualEffects;
import co.q64.arcade.core.api.gcompact.objects.items.ExtendedItem;
import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface GcompactManager extends Manager {
	public void enable(String series);

	public boolean isEnabled();

	public String getSeries();

	public void addEffect(UnusualEffects effect);

	public void enableEffects(Player p);

	public void disableEffects(Player p);

	public void openMenu(Player p);

	public void doKitValidation();

	public void addShopItem(ExtendedItem template, int price);

	public void onPlayerKill(Player p, Item item);
}