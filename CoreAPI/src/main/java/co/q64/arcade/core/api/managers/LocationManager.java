package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;

@Injectable
@Global
public interface LocationManager extends Manager {
	public void updateMove(BasePlayer p);

	public boolean isMoving(BasePlayer p);

	public boolean isMoving(BasePlayer p, int mills);

	public long timeSinceMove(BasePlayer p);

}