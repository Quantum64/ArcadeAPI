package co.q64.arcade.core.api.filter;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface FilterMenuCallback {
	public void menuClose(BasePlayer p);
}
