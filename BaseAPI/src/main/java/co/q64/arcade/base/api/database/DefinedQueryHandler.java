package co.q64.arcade.base.api.database;

import java.sql.ResultSet;
import java.sql.SQLException;

@FunctionalInterface
public interface DefinedQueryHandler<T> {
	T handle(ResultSet rs) throws SQLException;
}