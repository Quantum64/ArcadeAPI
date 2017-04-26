package co.q64.arcade.core.api.implementable;

import org.bukkit.Location;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.container.BaseLocation;

@Noinject(reason = Noinject.IMPLEMENT)
@FunctionalInterface
public interface LocationExecutor {
	public void execute(BaseLocation baseLocation);
}
