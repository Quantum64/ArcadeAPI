package co.q64.arcade.core.api.managers;

import java.util.List;
import java.util.Map;

import org.bukkit.entity.Player;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.key.KeyLibrary;

@Injectable
@Global
public interface KeyManager extends Manager {
	public void openMenu(Player p);

	public void openMenu(Player p, String series);

	public Map<KeyLibrary, Integer> getOwnedKeys(Player p);

	public void spendKey(Player p, String crateName);

	public void setKeyLibrary(Class<? extends KeyLibrary> lib);

	public Class<? extends KeyLibrary> getKeyLibrary();

	public void clearKeys();

	public void registerKeys();

	public void addKey(KeyLibrary key);

	public List<? extends KeyLibrary> getKeys();

	public KeyLibrary keyFromName(String name);
}