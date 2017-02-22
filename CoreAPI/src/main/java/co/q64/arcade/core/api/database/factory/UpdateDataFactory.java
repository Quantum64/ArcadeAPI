package co.q64.arcade.core.api.database.factory;

import co.q64.arcade.core.api.database.QueryExecutor;
import co.q64.arcade.core.api.database.objects.PlayerData;
import co.q64.arcade.core.api.database.objects.UpdateData;

/**
 * A factory that can be used for generating UpdateData queries
 * @author Dylan
 *
 */
public interface UpdateDataFactory {

	/**
	 * 
	 * @param runner the query executor to run this query on
	 * @param data the bean of data to send to the SQL server
	 * @param tableName the name of the table to update the data to
	 * @param saveMode weather the time sensitive data such as queues and infractions should be saved, this is usually false to prevent data such as this to be overwritten if saved while the player's data is still in memory elsewhere
	 * @return the UpdateData query
	 */
	public UpdateData create(QueryExecutor runner, PlayerData data, String tableName, boolean saveMode);
}
