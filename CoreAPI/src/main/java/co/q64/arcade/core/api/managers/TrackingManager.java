package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

@Injectable
@Global
public interface TrackingManager extends Manager {
	public void enableTracking();

	public boolean use();

	public boolean enabled();

	public void setName(String name);

	public String getName();
}