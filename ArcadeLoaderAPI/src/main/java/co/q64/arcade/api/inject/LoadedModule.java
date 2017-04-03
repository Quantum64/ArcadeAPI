package co.q64.arcade.api.inject;

public interface LoadedModule {
	public String getConfigName();

	public String getRepo();

	public String getName();

	public String getVersion();

	public String getStatus();
	
	public String getModule();
	
	public String getError();

	public boolean loaded();
}
