package co.q64.arcade.core.api.config;

import java.io.File;

import co.q64.arcade.core.api.annotation.inject.Injectable;
import co.q64.arcade.core.api.annotation.inject.Providable;

/**
 * The storage engine for config files, rebind this if you
 * want, it's easy to implement
 * The default engine is probably YAML, TOML, or props
 * @author Dylan
 *
 */
@Injectable
@Providable
public interface ConfigEngine {
	/**
	 * Reads the ENTIRE config file into a cache, this will
	 * only be called on reload and you should not read
	 * the file from disk at any other time than here
	 * @param file the file to open
	 */
	public void openFile(File file);

	/**
	 * Reads the entire config file into a section from
	 * the memory cache
	 * @return the complete section
	 */
	public ConfigSection openMainSection();

	/**
	 * Reads part of the config into a section from the
	 * memory cache
	 * @param name the part of the config to read
	 * @return the section
	 */
	public ConfigSection openSection(String name);

	/**
	 * Gets the file extension associated with
	 * this storage type sans dot
	 * ex. YAML should return "yml", and not ".yml"
	 * @return the file extension
	 */
	public String getFileExtension();
}
