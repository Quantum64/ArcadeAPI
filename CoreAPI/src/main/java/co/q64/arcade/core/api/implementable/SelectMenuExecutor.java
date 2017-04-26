package co.q64.arcade.core.api.implementable;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BaseItemStack;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject(reason = Noinject.IMPLEMENT)
public interface SelectMenuExecutor {
	public void onItemSelect(BasePlayer p, BaseItemStack item);

	public void onBack(BasePlayer p);
}
