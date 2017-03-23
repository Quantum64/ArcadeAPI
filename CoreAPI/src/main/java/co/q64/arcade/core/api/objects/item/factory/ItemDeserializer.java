package co.q64.arcade.core.api.objects.item.factory;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.objects.item.Item;

@Noinject
@FunctionalInterface
public interface ItemDeserializer {
	Item construct(String data);
}
