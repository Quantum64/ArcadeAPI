package co.q64.arcade.core.api.implementable;

import org.bukkit.entity.Entity;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface EntityExecutor {
	public void execute(Entity e);
}
