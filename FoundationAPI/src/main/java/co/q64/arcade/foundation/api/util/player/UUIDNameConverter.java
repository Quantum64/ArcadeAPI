package co.q64.arcade.foundation.api.util.player;

import java.util.Optional;
import java.util.UUID;

public interface UUIDNameConverter {
	public Optional<String> uuidToName(UUID uuid);
}
