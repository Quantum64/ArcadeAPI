package co.q64.arcade.core.api.net;

import java.util.Optional;
import java.util.UUID;

import javax.annotation.Nullable;

import org.bukkit.OfflinePlayer;
import org.bukkit.command.CommandSender;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

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
	 * Converts a player name to an OfflinePlayer
	 * @param name full name of the player
	 * @return OfflinePlayer if the name is valid or an empty optional if it is not
	 */
	public Optional<OfflinePlayer> getOfflinePlayer(String name);

	/**
	 * Converts a player name to a uuid
	 * @param name full name of the player
	 * @param cs command sender to print the error if the uuid cannot be resolved
	 * @return UUID if the name is valid or an empty optional if it is not
	 */
	public Optional<UUID> getUUID(String name, @Nullable CommandSender cs);

	/**
	 * Converts a player name to an OfflinePlayer
	 * @param name full name of the player
	 * @param cs command sender to print error if player cannot be resolved
	 * @return OfflinePlayer if the name is valid or an empty optional if it is not
	 */
	public Optional<OfflinePlayer> getOfflinePlayer(String name, @Nullable CommandSender cs);
}
