package co.q64.arcade.core.api.filter;

import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface ItemFilter {
	public abstract boolean checkItem(Item item);
}
