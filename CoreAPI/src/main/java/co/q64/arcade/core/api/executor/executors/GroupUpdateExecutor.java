package co.q64.arcade.core.api.executor.executors;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.executor.Executor;
import co.q64.arcade.core.api.executor.argument.PlayerArgumentMap;

@Noinject(reason = Noinject.CLASS)
public interface GroupUpdateExecutor extends Executor<PlayerArgumentMap> {}
