package co.q64.arcade.core.api.menu.executors;

import co.q64.arcade.base.api.container.BasePlayer;

@FunctionalInterface
public interface MenuTickExecutor {
	public void execute(BasePlayer player);
}
