package co.q64.arcade.core.api.config;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Represents a section of a config file
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
public interface ConfigSection {
	public boolean getBoolean(String key, boolean def);

	public int getInteger(String key, int def);

	public String getString(String key, String def);
}
