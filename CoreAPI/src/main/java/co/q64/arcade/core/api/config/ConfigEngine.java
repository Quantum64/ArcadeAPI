package co.q64.arcade.core.api.config;

public interface ConfigEngine {
	public void openFile();

	public ConfigSection openMainSection();
	
	public ConfigSection openSection();
}
