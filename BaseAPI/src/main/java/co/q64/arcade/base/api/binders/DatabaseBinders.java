package co.q64.arcade.base.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public interface DatabaseBinders {
	//formatter:off
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface PlayerData {}
	
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface MarketData {}
	//formatter:on
}
