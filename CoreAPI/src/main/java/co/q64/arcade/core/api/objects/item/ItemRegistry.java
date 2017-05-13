package co.q64.arcade.core.api.objects.item;

import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.objects.item.factory.ItemConstructor;
import co.q64.arcade.core.api.objects.item.factory.ItemDeserializer;

@Injectable
public interface ItemRegistry {
	public void registerItem(String type, Class<? extends Item> clazz, ItemDeserializer id, ItemConstructor ic);
}
