package co.q64.arcade.core.api.config.yaml;

import co.q64.arcade.base.api.config.yaml.YamlConfig;

public class MockYamlConfig implements YamlConfig {
	@Override
	public String getString(String key) {
		return null;
	}

	@Override
	public int getInt(String key) {
		return 0;
	}

	@Override
	public boolean getBoolean(String key) {
		return false;
	}

	@Override
	public String getString(String key, String def) {
		return def;
	}

	@Override
	public int getInt(String key, int def) {
		return def;
	}

	@Override
	public boolean getBoolean(String key, boolean def) {
		return def;
	}

	@Override
	public YamlConfig getSection(String key) {
		return this;
	}
}
