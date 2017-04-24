package co.q64.arcade.foundation.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public interface OptionBinders {
	//formatter:off
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME) @BindingAnnotation
	public static @interface ReflashKey {}
	//formatter:on
}
