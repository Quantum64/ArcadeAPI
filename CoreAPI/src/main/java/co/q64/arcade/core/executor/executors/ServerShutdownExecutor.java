package co.q64.arcade.core.executor.executors;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.core.api.executor.Executor;

@Noinject(reason = Noinject.CLASS)
public interface ServerShutdownExecutor extends Executor<ArgumentMap> {}
