package co.q64.arcade.core.api.executor;

public interface Executable<T extends ArgumentMap> {
	public String getName();
	
	public void call(T args);
	
	public void registerHandler(Handler<T> handler);
}
