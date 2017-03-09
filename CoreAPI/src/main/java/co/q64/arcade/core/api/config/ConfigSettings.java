package co.q64.arcade.core.api.config;

import co.q64.arcade.core.api.annotation.Injectable;
import co.q64.arcade.core.api.annotation.Providable;

/**
 * Settings to open a config file
 * @author Dylan
 *
 */
@Injectable
@Providable
public interface ConfigSettings {
	/**
	 * Gets if default values should be written to config
	 * @return if default values should be written
	 */
	public boolean isWriteDefault();

	/**
	 * Sets write default values to true
	 * @return this
	 */
	public ConfigSettings writeDefaults();

	/**
	 * Gets the file name the config will read from
	 * @return the file name
	 */
	public String getFileName();

	/**
	 * Sets the file name to open for the config
	 * DO NOT INCLUDE FILE EXTENSION
	 * @param name the file to open
	 * @return this
	 */
	public ConfigSettings withFileName(String name);
}
