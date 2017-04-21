package co.q64.arcade.core.api.task;

public interface ArcadeTask extends Runnable {
	public int getDelay();

	public int getPeriod();
}
