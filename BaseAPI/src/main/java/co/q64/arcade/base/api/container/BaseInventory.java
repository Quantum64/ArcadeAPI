package co.q64.arcade.base.api.container;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BaseInventory {

	public String getTitle();

	public BaseItemStack getItem(int i);

	public void setItem(int i, BaseItemStack baseItemStack);
}
