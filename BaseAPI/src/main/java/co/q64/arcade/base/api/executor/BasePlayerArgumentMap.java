package co.q64.arcade.base.api.executor;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.world.BasePlayer;

@Noinject(reason = Noinject.DATA)
public interface BasePlayerArgumentMap extends ArgumentMap {
	public BasePlayer getArguments();
}
