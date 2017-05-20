package co.q64.arcade.core.api.menu;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.core.api.menu.executors.BaseMenuTickExecutor;
import co.q64.arcade.core.api.menu.executors.MenuTickExecutor;

public interface Menu {
	public MenuItem addItem(Material item);

	public MenuItem addItem(ItemStack item);

	public Menu withName(String name);

	public Menu withSize(MenuSize size);

	public Menu withTickExecutor(BaseMenuTickExecutor exec);

	public Menu withTickExecutor(BaseMenuTickExecutor exec, int delay); // Execute this right after open is called too...
	
	public Menu withTickExecutor(MenuTickExecutor exec);

	public Menu withTickExecutor(MenuTickExecutor exec, int delay);

	public void open(Player player);

	public void open(BasePlayer player);
}
