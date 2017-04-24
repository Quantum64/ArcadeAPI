package co.q64.arcade.core.api.executor.executors.listener;

import co.q64.arcade.core.api.executor.Executor;
import co.q64.arcade.core.api.executor.argument.PlayerArgumentMap;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.CLASS)
public interface PlayerQuitExecutor extends Executor<PlayerArgumentMap> {}
