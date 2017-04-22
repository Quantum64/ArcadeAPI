package co.q64.arcade.core.api.reward;

import java.util.List;

import javax.annotation.Nullable;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.implementable.PlayerExecutor;
import co.q64.arcade.core.api.perm.Group;

@Injectable
public interface RewardTemplateFactory {
	public RewardTemplate create(@Assisted("name") String name, @Assisted("series") String series, List<String> rewards, long delay, int slot, boolean claimOnce, @Nullable Group group, PlayerExecutor onClaim);
}
