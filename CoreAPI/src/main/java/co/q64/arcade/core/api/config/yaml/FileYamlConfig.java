package co.q64.arcade.core.api.config.yaml;

import java.io.File;

import javax.inject.Inject;

import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;

import com.google.inject.assistedinject.Assisted;

import co.q64.arcade.base.api.config.yaml.YamlConfig;

public class FileYamlConfig implements YamlConfig {
	private @Inject @Assisted File file;

	private ConfigurationSection config;

	@Inject
	public void enable() {
		config = YamlConfiguration.loadConfiguration(file);
	}

	public YamlConfig setConfig(ConfigurationSection config) {
		this.config = config;
		return this;
	}

	@Override
	public String getString(String key) {
		return config.getString(key);
	}

	@Override
	public int getInt(String key) {
		return config.getInt(key);
	}

	@Override
	public boolean getBoolean(String key) {
		return config.getBoolean(key);
	}

	@Override
	public String getString(String key, String def) {
		return config.getString(key, def);
	}

	@Override
	public int getInt(String key, int def) {
		return config.getInt(key, def);
	}

	@Override
	public boolean getBoolean(String key, boolean def) {
		return config.getBoolean(key, def);
	}

	@Override
	public YamlConfig getSection(String key) {
		ConfigurationSection section = config.getConfigurationSection(key);
		return section == null ? new MockYamlConfig() : new FileYamlConfig().setConfig(section);
	}
}
