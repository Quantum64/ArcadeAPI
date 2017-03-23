package co.q64.arcade.core.api.implementable;

import org.bukkit.Location;

import co.q64.arcade.core.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface LocationExecutor {
	public void execute(Location l);
}
