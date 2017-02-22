package co.q64.arcade.core.api.database.objects;

import java.util.concurrent.Callable;

/**
 * Represents a SQL query that is able to fill a bean with player data
 * @author Dylan
 *
 */
public interface GetData extends Callable<PlayerData> {

}
