package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.core.api.executor.Executable;
import co.q64.arcade.core.api.executor.Executor;

@Injectable
@Global
public interface ExecutorManager extends Manager {
	public void registerExecutor(Class<? extends Executor<?>> e);

	public <T extends ArgumentMap> Executable<T> getExecutor(Class<? extends Executor<T>> clazz);

}