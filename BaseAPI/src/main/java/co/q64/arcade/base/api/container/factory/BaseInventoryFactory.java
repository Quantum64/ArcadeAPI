package co.q64.arcade.base.api.container.factory;

import co.q64.arcade.base.api.container.BaseInventory;

public interface BaseInventoryFactory {
	public BaseInventory create(int size);
	
	public BaseInventory create(int size, String name);
}
