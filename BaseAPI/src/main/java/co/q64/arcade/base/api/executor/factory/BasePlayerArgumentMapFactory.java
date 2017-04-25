package co.q64.arcade.base.api.executor.factory;

import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.executor.BasePlayerArgumentMap;

public interface BasePlayerArgumentMapFactory {
	public BasePlayerArgumentMap create(BasePlayer player);
}
