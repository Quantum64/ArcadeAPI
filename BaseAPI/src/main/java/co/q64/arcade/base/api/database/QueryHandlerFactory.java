package co.q64.arcade.base.api.database;


public interface QueryHandlerFactory {
	public <T> QueryHandler<T> getHandler(DefinedQueryHandler<T> handler, Class<T> clazz);

	public <T> QueryHandler<T> getBeanHandler(Class<T> clazz);

	public <T> QueryListHandler<T> getBeanListHandler(Class<T> clazz);
}
