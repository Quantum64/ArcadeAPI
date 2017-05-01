package co.q64.arcade.base.api.util;

public interface TaskRunner {
	public void runSync(Runnable task);

	public void runSync(Runnable task, int ticks);
}
