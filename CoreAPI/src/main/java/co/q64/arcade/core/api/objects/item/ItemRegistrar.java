package co.q64.arcade.core.api.objects.item;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface ItemRegistrar {
	public void setup(ItemRegistry r);
}
