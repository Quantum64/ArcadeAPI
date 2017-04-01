package co.q64.arcade.api.inject;

import java.util.Map;

/**
 * Contains information about the modules in this universe
 * @author Dylan
 *
 */
public interface ModuleInfo {
	/**
	 * Gets a list of all loaded modules
	 * @return the list of modules
	 */
	public Map<AbstractArcadeModule, String> getModules();
}
