package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.core.api.executor.Executable;
import co.q64.arcade.core.api.executor.Executor;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface ExecutorManager extends Manager {
	public void registerExecutor(Class<? extends Executor<?>> e);

	public <T extends ArgumentMap> Executable<T> getExecutor(Class<? extends Executor<T>> clazz);

}