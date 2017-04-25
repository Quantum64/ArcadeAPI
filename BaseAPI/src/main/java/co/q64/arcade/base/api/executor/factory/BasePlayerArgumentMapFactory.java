package co.q64.arcade.base.api.executor.factory;

import co.q64.arcade.base.api.executor.BasePlayerArgumentMap;
import co.q64.arcade.base.api.world.BasePlayer;

public interface BasePlayerArgumentMapFactory {
	public BasePlayerArgumentMap create(BasePlayer player);
}
