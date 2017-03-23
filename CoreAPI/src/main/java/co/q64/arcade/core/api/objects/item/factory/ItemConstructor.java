package co.q64.arcade.core.api.objects.item.factory;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.core.api.objects.item.types.Obtained;

@Noinject
@FunctionalInterface
public interface ItemConstructor {
	Item construct(String object, Obtained obtained);
}
