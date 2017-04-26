package co.q64.arcade.core.api.holo;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface HoloTextGetter {
	public String getText(BasePlayer p);
}
