package co.q64.arcade.core.api.database.factory;

import java.util.UUID;

import org.apache.commons.dbutils.handlers.BeanHandler;

import co.q64.arcade.core.api.database.QueryExecutor;
import co.q64.arcade.core.api.database.objects.GetData;
import co.q64.arcade.core.api.database.objects.PlayerData;

/**
 * A factory that can be used to retrieve queries for obtaining player data
 * @author Dylan
 *
 */
public interface GetDataFactory {
	
	/**
	 * Creates a new instance of GetData, an query used for retrieving player data
	 * 
	 * @param runner the query executor to run the GetData with
	 * @param player the UUID of the player whose data will be fetched
	 * @param tableName the name of the table to fetch the data from
	 * @param definedHandler the data parser to fill the bean
	 * @param bean the class to fill with the data
	 * @return the GetData query, which can be executed directly
	 */
	public GetData create(QueryExecutor runner, UUID player, String tableName, BeanHandler<? extends PlayerData> definedHandler, Class<? extends PlayerData> bean);
}
