package co.q64.arcade.base.api.util.player;

import java.util.Optional;
import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

@Injectable
@Global
public interface UUIDNameConverter {
	public Optional<String> uuidToName(UUID uuid);
}
