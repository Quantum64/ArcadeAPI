package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;

@Injectable
@Global
public interface LocationManager extends Manager {
	public void updateMove(Player p);

	public boolean isMoving(Player p);

	public boolean isMoving(Player p, int mills);

	public long timeSinceMove(Player p);

}