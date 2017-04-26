package co.q64.arcade.base.api.container;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BaseItemMeta {

	public List<String> getLore();

	public String getDisplayName();

	public boolean hasDisplayName();

	public void setDisplayName(String name);
	
	public void setSkullOwner(String owner);

	public boolean hasLore();

	public void setLore(List<String> lore);

	//public Map<Enchantment, Integer> getEnchants();
}
