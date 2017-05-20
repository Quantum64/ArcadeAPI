package co.q64.arcade.core.api.menu.executors;

import co.q64.arcade.base.api.container.BasePlayer;

@FunctionalInterface
public interface BaseMenuTickExecutor {
	public void execute(BasePlayer player);
}
