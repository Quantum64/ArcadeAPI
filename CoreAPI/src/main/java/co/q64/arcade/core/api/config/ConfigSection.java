package co.q64.arcade.core.api.config;

import java.util.List;

import co.q64.arcade.foundation.api.annotation.inject.Noinject;

/**
 * Represents a section of a config file
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface ConfigSection {
	/**
	 * Gets a boolean value from this section
	 * @param key the config key to read
	 * @param def the default value if read fails or does not exist
	 * @return the boolean value or def
	 */
	public boolean getBoolean(String key, boolean def);

	/**
	 * Gets an integer value from the config
	 * @param key the key to read from
	 * @param def the default value if read fails or does not exist
	 * @return the integer value or def
	 */
	public int getInteger(String key, int def);

	/**
	 * Gets a string value from the config
	 * @param key the key to read from
	 * @param def the default value if read fails or does not exist
	 * @return the string value or def
	 */
	public String getString(String key, String def);

	/**
	 * Gets a config section by name or returns an EMPTY config
	 * section that contains no values if the key does not exist
	 * @param name the section to get
	 * @return the section for that name or an EMPTY section if none exists
	 */
	public ConfigSection getSection(String key);

	/**
	 * Gets a list of strings from the config
	 * @param key the key to read from
	 * @param def the default value if read fails or does not exist
	 * @return the list of strings or def
	 */
	public List<String> getStringList(String key, List<String> def);
}
