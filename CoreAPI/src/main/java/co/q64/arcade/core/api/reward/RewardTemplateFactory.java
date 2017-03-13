package co.q64.arcade.core.api.reward;

import java.util.List;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;

@Injectable	
public interface RewardTemplateFactory {
	public RewardTemplate create(String name, List<String> rewards, long delay, int slot, boolean claimOnce, Group group, PlayerExecutor onClaim);
}
