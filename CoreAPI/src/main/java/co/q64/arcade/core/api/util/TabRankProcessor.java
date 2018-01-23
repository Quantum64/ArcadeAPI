package co.q64.arcade.core.api.util;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.perm.Group;

public interface TabRankProcessor {
	public String processRank(Player p, Group g);
}
