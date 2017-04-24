package co.q64.arcade.core.api.objects.item.factory;

import co.q64.arcade.core.api.objects.item.Item;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject
@FunctionalInterface
public interface ItemDeserializer {
	Item construct(String data);
}
