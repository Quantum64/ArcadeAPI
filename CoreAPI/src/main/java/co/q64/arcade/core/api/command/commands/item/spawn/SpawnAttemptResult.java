package co.q64.arcade.core.api.command.commands.item.spawn;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.objects.item.Item;

@Noinject(reason = Noinject.DATA)
public interface SpawnAttemptResult {
	public boolean isSuccess();

	public Item getItem();

	public String getError();

	public SpawnAttemptResult setSuccess(Item item);

	public SpawnAttemptResult setFail(String error);
}
