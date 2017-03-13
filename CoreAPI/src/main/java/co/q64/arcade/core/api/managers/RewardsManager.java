package co.q64.arcade.core.api.managers;

import java.util.List;

import org.bukkit.FireworkEffect;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;
import co.q64.arcade.core.api.reward.RewardTemplate;

@Injectable
@Global
public interface RewardsManager extends Manager {
	public List<RewardTemplate> getRewards();

	public void clearRewards();

	public void registerReward(String name, List<String> rewards, long delay, int slot, boolean claimOnce, Group g, PlayerExecutor onClaim);

	public void openMenu(Player p);

	public void createClaimLocation(Player p);

	public void delClaimLocation(Player p);

	public List<ArmorStand> getClaimLocations();

	public List<FireworkEffect> getEffects();
}