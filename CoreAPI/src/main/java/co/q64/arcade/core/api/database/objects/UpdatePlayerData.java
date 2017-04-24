package co.q64.arcade.core.api.database.objects;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * Represents a SQL query that is able to send the data in a bean to a SQL server
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface UpdatePlayerData extends Runnable {

}
