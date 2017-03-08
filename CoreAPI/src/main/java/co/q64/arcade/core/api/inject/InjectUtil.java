package co.q64.arcade.core.api.inject;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Utilities for binding common core classes
 * @author Dylan
 *
 */
@Noinject
public class InjectUtil {
	/**
	 * Gets a multibinder for a class type
	 * @param binder the module binder
	 * @param type the class type
	 * @return the multibinder
	 */
	public static <T> Multibinder<T> getMultibinder(Binder binder, Class<T> type) {
		return Multibinder.newSetBinder(binder, type);
	}
}
