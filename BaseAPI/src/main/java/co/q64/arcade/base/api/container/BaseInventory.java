package co.q64.arcade.base.api.container;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface BaseInventory {

	public String getTitle();

	public BaseItemStack getItem(int i);

	public void setItem(int i, BaseItemStack baseItemStack);

	public BaseItemStack[] getArmorContents();

	public List<BaseItemStack> getContents();
	
	public void remove(BaseItemStack stack);
	
	public BaseInventoryType getType();

	public void clear();

	public void setArmorContents(BaseItemStack[] n);
}
