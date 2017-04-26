package co.q64.arcade.core.api.managers;

import java.util.List;
import java.util.Map;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;
import co.q64.arcade.base.api.container.BasePlayer;
import co.q64.arcade.base.api.managers.Manager;
import co.q64.arcade.core.api.key.KeyLibrary;

@Injectable
@Global
public interface KeyManager extends Manager {
	public void openMenu(BasePlayer p);

	public void openMenu(BasePlayer p, String series);

	public Map<KeyLibrary, Integer> getOwnedKeys(BasePlayer p, boolean real);

	public void spendKey(BasePlayer p, String crateName, boolean real);

	public void setKeyLibrary(Class<? extends KeyLibrary> lib);

	public Class<? extends KeyLibrary> getKeyLibrary();

	public void clearKeys();

	public void registerKeys();

	public void addKey(KeyLibrary key);

	public List<? extends KeyLibrary> getKeys();

	public KeyLibrary keyFromName(String name);
}