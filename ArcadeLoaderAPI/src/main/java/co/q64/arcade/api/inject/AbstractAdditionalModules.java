package co.q64.arcade.api.inject;

public abstract class AbstractAdditionalModules {
	public abstract String getName();

	public String getRequiredPlugin() {
		return new String();
	}

	public boolean enableDefault() {
		return false;
	}
}
