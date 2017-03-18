package co.q64.arcade.core.api.reward;

import java.util.List;

import javax.annotation.Nullable;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;

@Injectable
public interface RewardTemplateFactory {
	public RewardTemplate create(String name, List<String> rewards, long delay, int slot, boolean claimOnce, @Nullable Group group, PlayerExecutor onClaim);
}
