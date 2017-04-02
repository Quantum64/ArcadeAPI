package co.q64.arcade.core.api.managers;

import java.util.List;

import org.bukkit.FireworkEffect;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;
import co.q64.arcade.core.api.reward.RewardTemplate;

@Injectable
@Global
public interface RewardsManager extends Manager {
	public List<RewardTemplate> getRewards();

	public List<RewardTemplate> getRewards(String series);

	public void clearRewards();

	public void clearRewards(String series);

	public void registerSeries(String series, String tag);

	public void registerReward(String name, List<String> rewards, long delay, int slot, boolean claimOnce, Group g, PlayerExecutor onClaim);

	public void registerReward(String name, String series, List<String> rewards, long delay, int slot, boolean claimOnce, Group g, PlayerExecutor onClaim);

	public void openMenu(Player p);

	public void openMenu(Player p, String series);

	public void createClaimLocation(Player p);

	public void createClaimLocation(Player p, String series);

	public void delClaimLocation(Player p);

	public List<ArmorStand> getClaimLocations();

	public List<ArmorStand> getClaimLocations(String series);

	public List<FireworkEffect> getEffects();
}