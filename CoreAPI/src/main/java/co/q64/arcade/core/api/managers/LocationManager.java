package co.q64.arcade.core.api.managers;

import org.bukkit.entity.Player;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

@Injectable
@Global
public interface LocationManager extends Manager {
	public void updateMove(Player p);

	public boolean isMoving(Player p);

	public boolean isMoving(Player p, int mills);

	public long timeSinceMove(Player p);

}