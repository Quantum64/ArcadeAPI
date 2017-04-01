package co.q64.arcade.api.inject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.AbstractModule;

public abstract class AbstractArcadeModule extends AbstractModule {
	public abstract List<String> getRequiredPlugins();

	public Map<AbstractAdditionalModules, AbstractModule> getAdditionalModules() {
		return new HashMap<AbstractAdditionalModules, AbstractModule>();
	}

	public String getName() {
		return "null";
	}

	public String getVersion() {
		return "1.0";
	}
}
