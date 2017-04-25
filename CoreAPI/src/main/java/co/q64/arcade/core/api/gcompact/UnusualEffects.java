package co.q64.arcade.core.api.gcompact;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.core.api.implementable.LocationExecutor;

@Noinject(reason = Noinject.IMPLEMENT)
public interface UnusualEffects {
	public LocationExecutor getExecutor();

	public String getName();

	public String getNiceName();
}
