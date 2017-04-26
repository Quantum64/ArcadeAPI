package co.q64.arcade.core.api.managers;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;

@Injectable
@Global
public interface TradeManager extends Manager {
	public void openMenu(BasePlayer p);

	public boolean canTrade(BasePlayer p);

	public void openSession(BasePlayer p, BasePlayer l);

	public void resumeSession(BasePlayer p);
}