package co.q64.arcade.base.api.database;

import java.util.List;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface QueryListHandler<T> extends QueryHandler<List<T>> {}
