package co.q64.arcade.api;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.inject.AbstractModule;

public abstract class AbstractArcadeModule extends AbstractModule {
	public abstract List<String> getRequiredPlugins();

	public Map<AbstractAdditionalModules, AbstractModule> getAdditionalModules() {
		return new HashMap<AbstractAdditionalModules, AbstractModule>();
	}
}
