package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.core.api.executor.Executable;
import co.q64.arcade.core.api.executor.Executor;

@Injectable
@Global
public interface ExecutorManager extends Manager {
	public void registerExecutor(Executor<?> e);

	public <T extends ArgumentMap> Executable<T> getExecutor(Class<? extends Executor<T>> clazz);

}