package co.q64.arcade.core.api.implementable;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface PlayerExecutor {
	public void execute(BasePlayer p);
}
