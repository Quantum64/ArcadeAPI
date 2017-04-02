package co.q64.arcade.core.api.reward;

import java.util.List;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;

@Noinject(reason = Noinject.DATA)
public interface RewardTemplate {
	public String getName();
	
	public String getSeries();

	public List<String> getRewards();

	public long getDelay();

	public int getSlot();

	public PlayerExecutor getOnClaim();

	public Group getGroup();

	public long getUnlockTime(Player p);

	public RewardStatus canClaim(Player p);

	public void claim(Player p);

}