package co.q64.arcade.core.api.managers;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.holo.HoloTextGetter;

@Injectable
@Global
public interface HologramManager extends Manager {
	public void registerCustomHolo(String parentName, float yOffset, int triggerDistance, HoloTextGetter standName);
}