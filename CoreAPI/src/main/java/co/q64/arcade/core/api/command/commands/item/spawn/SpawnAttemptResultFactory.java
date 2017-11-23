package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.objects.item.Item;

@Injectable
public interface SpawnAttemptResultFactory {
	public SpawnAttemptResult success(Item item);

	public SpawnAttemptResult fail(String error);
}
