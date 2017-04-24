package co.q64.arcade.core.api.executor.executors;

import co.q64.arcade.core.api.executor.ArgumentMap;
import co.q64.arcade.core.api.executor.Executor;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.CLASS)
public interface ServerShutdownExecutor extends Executor<ArgumentMap> {}
