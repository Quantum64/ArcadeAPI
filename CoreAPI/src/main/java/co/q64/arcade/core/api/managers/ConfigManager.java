package co.q64.arcade.core.api.managers;

import java.io.File;

import co.q64.arcade.core.api.config.ConfigSection;
import co.q64.arcade.core.api.config.ConfigSettings;
import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;
import co.q64.arcade.foundation.api.managers.Manager;

/**
 * The central component for reading from and writing to config
 * files through arcade
 * @author Dylan
 *
 */
@Injectable
@Global
public interface ConfigManager extends Manager {
	/**
	 * Gets the folder all config files are stored in
	 * @return the config folder
	 */
	public File getConfigFolder();

	/**
	 * Registers a file SANS EXTENSION that config can be loaded from
	 * failure to register will result in all config opens returning
	 * a MOCK config
	 * @param name the name of the file sans extension
	 */
	public void registerFile(String name);

	/**
	 * Reloads all config files from disk to memory
	 */
	public void reloadConfig();

	/**
	 * Opens a section from a memory cache of the config
	 * @param settings the settings for opening the cache
	 * @return the opened section
	 */
	public ConfigSection open(ConfigSettings settings);

	/**
	 * Opens the default config section from a memory cache
	 * @return the default section
	 */
	public ConfigSection open();
}
