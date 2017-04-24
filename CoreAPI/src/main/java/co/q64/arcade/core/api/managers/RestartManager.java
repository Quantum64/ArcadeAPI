package co.q64.arcade.core.api.managers;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

@Injectable
@Global
public interface RestartManager extends Manager {
	public void enableAutoRestart(int first, int hours);
}