package co.q64.arcade.core.api.inject;

import co.q64.arcade.base.api.annotation.inject.Noinject;
import co.q64.arcade.base.api.annotation.inject.Universal;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

/**
 * Utilities for binding common core classes
 * @author Dylan
 *
 */
@Noinject
@Universal
public interface InjectUtil {
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
