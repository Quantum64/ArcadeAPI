package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.objects.item.Item;

@Injectable
@Global
public interface GiftManager extends Manager {
	public void openMenu(BasePlayer p);

	public void onStop();

	public String getGiftSkull();

	public void sendGiftCannon(BasePlayer sender, Item gift);
}