package co.q64.arcade.base.api.container.factory;

import co.q64.arcade.base.api.container.BaseItemStack;
import co.q64.arcade.base.api.container.BaseMaterial;

public interface BaseItemStackFactory {
	public BaseItemStack create(BaseMaterial type);

	public BaseItemStack create(BaseMaterial type, int amount);

	public BaseItemStack create(BaseMaterial type, int amount, short data);
}
