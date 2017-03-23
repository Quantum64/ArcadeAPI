package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.inject.Global;
import co.q64.arcade.core.api.annotation.inject.Injectable;

@Injectable
@Global
public interface RestartManager extends Manager {
	public void enableAutoRestart(int first, int hours);
}