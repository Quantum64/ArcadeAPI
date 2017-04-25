package co.q64.arcade.base.api.executor;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BaseInventory;
import co.q64.arcade.base.api.container.BaseItemStack;
import co.q64.arcade.base.api.container.BasePlayer;

@Noinject(reason = Noinject.DATA)
public interface BaseInventoryArgumentMap extends ArgumentMap {
	public BasePlayer getArguments();

	public BaseInventory getInventory();

	public BaseItemStack getClicked();

	public int getSlot();

	public boolean getCancelled();

	public void setCancelled(boolean c);

	public int getRawSlot();
}
