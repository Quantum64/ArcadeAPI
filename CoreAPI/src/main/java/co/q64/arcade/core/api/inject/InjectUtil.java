package co.q64.arcade.core.api.inject;

import com.google.inject.Binder;
import com.google.inject.multibindings.Multibinder;

/**
 * Utilities for binding common core classes
 * @author Dylan
 *
 */
public class InjectUtil {
	public static <T> Multibinder<T> getMultibinder(Binder binder, Class<T> type) {
		return Multibinder.newSetBinder(binder, type);
	}
}
