package co.q64.arcade.base.api.config.yaml;

import co.q64.arcade.base.api.annotation.inject.Noinject;

@Noinject
public interface YamlConfig {
	public String getString(String key);

	public int getInt(String key);

	public boolean getBoolean(String key);

	public String getString(String key, String def);

	public int getInt(String key, int def);

	public boolean getBoolean(String key, boolean def);

	public YamlConfig getSection(String key);
}
