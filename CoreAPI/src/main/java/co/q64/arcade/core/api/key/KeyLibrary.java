package co.q64.arcade.core.api.key;

import org.bukkit.Material;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface KeyLibrary {
	public String getCrateName();

	public String getSeries();

	public Material getMenuItem();

	public int getMenuSlot();

	public int getCredits();

	public int getCoins();
}
