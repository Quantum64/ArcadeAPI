package co.q64.arcade.core.api.filter;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.objects.item.Item;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface ItemFilter {
	public abstract boolean checkItem(Item item);
}
