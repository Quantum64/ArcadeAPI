package co.q64.arcade.core.api.executor.executors;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.executor.ArgumentMap;
import co.q64.arcade.base.api.executor.Executor;

@Noinject(reason = Noinject.CLASS)
public interface ServerShutdownExecutor extends Executor<ArgumentMap> {}
