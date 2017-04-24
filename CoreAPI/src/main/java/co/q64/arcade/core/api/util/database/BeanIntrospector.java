package co.q64.arcade.core.api.util.database;

import java.util.Map;
import java.util.Optional;

import co.q64.arcade.foundation.api.annotation.inject.Global;
import co.q64.arcade.foundation.api.annotation.inject.Injectable;

/**
 * A utility for introspecting beans
 * @author Dylan
 *
 */
@Injectable
@Global
public interface BeanIntrospector {

	/**
	 * Introspects a bean
	 * @param obj the bean to be introspected
	 * @return a map of the field names field objects contained in this bean
	 */
	public Map<String, Object> introspect(Object obj);

	/**
	 * Introspects a bean
	 * @param obj the bean to be introspected 
	 * @param update if the result is for an automatic update
	 * @return a map of the field names field objects contained in this bean
	 */
	public Map<String, Object> introspect(Object obj, boolean update);

	public Optional<String> getPrimary(Class<?> clazz);
}
