package co.q64.arcade.core.api.menu;

import java.util.List;

import co.q64.arcade.core.api.menu.executors.BasePlayerMenuExecutor;
import co.q64.arcade.core.api.menu.executors.BasePlayerMenuItemExecutor;
import co.q64.arcade.core.api.menu.executors.PlayerMenuExecutor;
import co.q64.arcade.core.api.menu.executors.PlayerMenuItemExecutor;

public interface MenuItem {
	public MenuItem withName(String name);

	public MenuItem withAmount(int amount);

	public MenuItem withData(short data);

	public MenuItem withLore(String lore);

	public MenuItem withLore(List<String> lore);

	public MenuItem withSlots(int slot);

	public MenuItem withSlots(int[] slots);

	public MenuItem withSlots(List<Integer> slots);

	public MenuItem withCallback(BasePlayerMenuExecutor exec);

	public MenuItem withCallback(BasePlayerMenuItemExecutor exec);

	public MenuItem withCallback(PlayerMenuExecutor exec);

	public MenuItem withCallback(PlayerMenuItemExecutor exec);

	public Menu construct();
}
