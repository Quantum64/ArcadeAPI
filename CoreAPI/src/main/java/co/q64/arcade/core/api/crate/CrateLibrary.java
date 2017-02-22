package co.q64.arcade.core.api.crate;

import org.bukkit.Material;

public interface CrateLibrary {
	public String getCrateName();

	public int getCrateNumber();

	public Material getCrateItem();

	public VirtualCrate getCrate();

	public boolean isDropped();
	
	public float getDropMod(); 
	
	public String getSeries();
}
