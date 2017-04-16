package co.q64.arcade.core.api.executor.executors.listener;

import co.q64.arcade.core.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.executor.Executor;
import co.q64.arcade.core.api.executor.argument.PlayerArgumentMap;

@Noinject(reason = Noinject.CLASS)
public interface PlayerJoinExecutor extends Executor<PlayerArgumentMap> {}
