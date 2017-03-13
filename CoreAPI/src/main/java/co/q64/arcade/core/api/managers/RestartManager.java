package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

@Injectable
@Global
public interface RestartManager extends Manager {
	public void enableAutoRestart(int first, int hours);
}