package co.q64.arcade.base.api.container;

import java.util.List;
import java.util.Map;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BaseItemMeta {

	public List<String> getLore();

	public String getDisplayName();

	public boolean hasDisplayName();

	public void setDisplayName(String name);

	//public Map<Enchantment, Integer> getEnchants();
}
