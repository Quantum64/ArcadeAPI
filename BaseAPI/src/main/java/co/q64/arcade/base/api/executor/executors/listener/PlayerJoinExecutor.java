package co.q64.arcade.base.api.executor.executors.listener;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.executor.BasePlayerArgumentMap;
import co.q64.arcade.base.api.executor.Executor;

@Noinject(reason = Noinject.CLASS)
public interface PlayerJoinExecutor extends Executor<BasePlayerArgumentMap> {}
