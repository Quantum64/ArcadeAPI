package co.q64.arcade.api.util;

import java.util.Optional;

public interface ReloadableDataStore {
	public void put(String key, Object value);

	public <T> Optional<T> get(String key, Class<T> type);
}
