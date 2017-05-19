package co.q64.arcade.core.api.menu.executors;

import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.core.api.menu.MenuItem;

@FunctionalInterface
public interface BasePlayerMenuItemExecutor {
	public void execute(BasePlayer player, MenuItem item);
}
