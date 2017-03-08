package co.q64.arcade.core.api.database;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.annotation.Providable;

/**
 * Represents an executable that that retrieves a player's data while they are offline
 * @author Dylan
 *
 * @param <T> the bean class of the data to get for the player
 */
@Injectable
@Providable
public interface OfflinePlayerAction<T> extends Runnable {

}
