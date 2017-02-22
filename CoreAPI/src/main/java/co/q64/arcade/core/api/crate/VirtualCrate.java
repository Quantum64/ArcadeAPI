package co.q64.arcade.core.api.crate;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.item.ArcadeItem;

public interface VirtualCrate {
	public List<String> getLore();

	public ArcadeItem openCrate(Player p);
}
