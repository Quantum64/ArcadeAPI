package co.q64.arcade.core.api.implementable;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.core.api.objects.item.Item;

@Noinject(reason = Noinject.IMPLEMENT)
public interface SelectItemExecutor {
	public void onItemSelect(BasePlayer p, Item item);

	public void onBack(BasePlayer p);
}
