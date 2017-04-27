package co.q64.arcade.base.api.net;

import java.util.Optional;
import java.util.UUID;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.util.message.MessageReceiver;

/**
 * Allows names to be converted to UUIDs or OfflinePlayers
 * @author Dylan	
 *
 */
@Injectable
@Global
public interface UUIDService {
	/**
	 * Converts a player name to a uuid
	 * @param name full name of the player
	 * @return UUID if the name is valid or an empty optional if it is not
	 */
	public Optional<UUID> getUUID(String name);

	/**
	 * Converts a player name to a uuid
	 * @param name full name of the player
	 * @param cs command sender to print the error if the uuid cannot be resolved
	 * @return UUID if the name is valid or an empty optional if it is not
	 */
	public Optional<UUID> getUUID(String name, MessageReceiver cs);
}
