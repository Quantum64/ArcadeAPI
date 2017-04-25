package co.q64.arcade.base.api.database.objects;

import java.util.List;
import java.util.concurrent.Callable;

import co.q64.arcade.base.api.annotation.inject.Noinject;

/**
 * Represents a SQL query that is able to fill a bean with player data
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface GetData extends Callable<List<? extends GeneralData>> {

}
