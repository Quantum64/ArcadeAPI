package co.q64.arcade.core.api.database;

import co.q64.arcade.core.api.database.objects.PlayerData;

public interface PlayerDataExecutor<T extends PlayerData> {
	public void execute(T data);
}