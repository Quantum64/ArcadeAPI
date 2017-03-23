package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.objects.item.Item;

@Injectable
@Global
public interface GiftManager extends Manager {
	public void openMenu(Player p);

	public void onStop();

	public String getGiftSkull();

	public void sendGiftCannon(Player sender, Item gift);
}