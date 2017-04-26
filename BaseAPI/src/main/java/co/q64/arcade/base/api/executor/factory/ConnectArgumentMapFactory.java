package co.q64.arcade.base.api.executor.factory;

import java.util.UUID;

import co.q64.arcade.base.api.executor.ConnectArgumentMap;

public interface ConnectArgumentMapFactory {
	public ConnectArgumentMap create(UUID player);
}
