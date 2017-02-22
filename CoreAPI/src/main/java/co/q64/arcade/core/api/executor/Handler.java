package co.q64.arcade.core.api.executor;

@FunctionalInterface
public interface Handler<T extends ArgumentMap> {
	public void execute(T argumentMap);
}