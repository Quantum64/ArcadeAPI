package co.q64.arcade.core.api.managers;

import java.util.UUID;

import org.bukkit.Location;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.holo.HoloTextGetter;

@Injectable
@Global
public interface HologramManager extends Manager {
	public UUID registerCustomHolo(String parentName, float yOffset, int triggerDistance, HoloTextGetter standName);

	public UUID registerCustomHolo(Location location, float yOffset, int triggerDistance, HoloTextGetter standName);

	public void destroyHolo(UUID id);
}