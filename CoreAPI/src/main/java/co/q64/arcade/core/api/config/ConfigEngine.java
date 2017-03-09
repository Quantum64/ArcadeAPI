package co.q64.arcade.core.api.config;

import java.io.File;

public interface ConfigEngine {
	public void openFile(File file);

	public ConfigSection openMainSection();
	
	public ConfigSection openSection(String name);
	
	public String getFileExtension();
}
