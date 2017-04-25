package co.q64.arcade.base.api.container;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BaseItemStack {
	public BaseMaterial getType();

	public BaseItemMeta getItemMeta();

	public boolean hasItemMeta();
}
