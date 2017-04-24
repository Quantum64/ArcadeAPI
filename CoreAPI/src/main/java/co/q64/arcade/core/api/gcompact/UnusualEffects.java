package co.q64.arcade.core.api.gcompact;

import co.q64.arcade.core.api.implementable.LocationExecutor;
import co.q64.arcade.foundation.api.annotation.inject.Noinject;

@Noinject(reason = Noinject.IMPLEMENT)
public interface UnusualEffects {
	public LocationExecutor getExecutor();

	public String getName();

	public String getNiceName();
}
