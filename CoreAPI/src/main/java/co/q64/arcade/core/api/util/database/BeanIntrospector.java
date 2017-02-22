package co.q64.arcade.core.api.util.database;

import java.util.Map;

/**
 * A utility for introspecting beans
 * @author Dylan
 *
 */
public interface BeanIntrospector {

	/**
	 * 
	 * @param obj the bean to be introspected
	 * @return a map of the field names field objects contained in this bean
	 */
	public Map<String, Object> introspect(Object obj);
}
