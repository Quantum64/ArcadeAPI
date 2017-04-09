package co.q64.arcade.core.api.database.objects;

import java.util.concurrent.Callable;

import co.q64.arcade.core.api.annotation.inject.Noinject;

/**
 * Represents a SQL query that is able to fill a bean with player data
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface GetPlayerData extends Callable<PlayerData> {

}
