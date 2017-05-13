package co.q64.arcade.base.api.database;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface QueryHandler<T> {
	public Class<?> getResultClass();
}
