package co.q64.arcade.core.api.reward;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BasePlayer;
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

	public long getUnlockTime(BasePlayer p);

	public RewardStatus canClaim(BasePlayer p);

	public void claim(BasePlayer p);

}