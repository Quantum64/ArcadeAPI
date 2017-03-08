package co.q64.arcade.core.api.database;

import java.sql.SQLException;

import org.apache.commons.dbutils.ResultSetHandler;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Represents an object capable of executing SQL queries
 * @author Dylan
 *
 */
@Injectable
@Global
public interface QueryExecutor {

	/**
	 * Executes a SQL query on this query runner.  This is a blocking operation.
	 * 
	 * @param sql the SQL statement to execute
	 * @param rsh the result set handler to accept results
	 * @param params the prepared statement variables
	 * @return the result of the SQL query
	 * @throws SQLException if there was an error during execution
	 */
	public <T> T query(String sql, ResultSetHandler<T> rsh, Object... params) throws SQLException;

	/**
	 * Executes a SQL update on this query runner.  This is a blocking operation.
	 * 
	 * @param sql the SQL statement to execute
	 * @param params the prepared statement variables
	 * @return the number of affected rows
	 * @throws SQLException if there was an error during query execution
	 */
	public int update(String sql, Object... params) throws SQLException;
}
