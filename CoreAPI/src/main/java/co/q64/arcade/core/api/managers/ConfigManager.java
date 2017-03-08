package co.q64.arcade.core.api.managers;

import java.io.File;

import co.q64.arcade.core.api.config.ConfigSection;
import co.q64.arcade.core.api.config.ConfigSettings;

public interface ConfigManager {
	public void enable();

	public File getConfigFolder();

	public void registerFile(String name);

	public void reloadConfig();

	public ConfigSection open(ConfigSettings settings);
	
	public ConfigSection open();
}