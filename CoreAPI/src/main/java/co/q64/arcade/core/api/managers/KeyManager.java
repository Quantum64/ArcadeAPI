package co.q64.arcade.core.api.managers;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.key.KeyLibrary;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

@Injectable
@Global
public interface KeyManager extends Manager {
	public void openMenu(Player p);

	public void openMenu(Player p, String series);

	public Map<KeyLibrary, Integer> getOwnedKeys(Player p, boolean real);

	public void spendKey(Player p, String crateName, boolean real);

	public void setKeyLibrary(Class<? extends KeyLibrary> lib);

	public Class<? extends KeyLibrary> getKeyLibrary();

	public void clearKeys();

	public void registerKeys();

	public void addKey(KeyLibrary key);

	public List<? extends KeyLibrary> getKeys();

	public KeyLibrary keyFromName(String name);
}