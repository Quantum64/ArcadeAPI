package co.q64.arcade.foundation.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public interface UUIDServiceBinders {
	//formatter:off
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface UseUUIDFallback {}
	
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface UUIDRestUrl {}
	
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface UUIDFieldName {}
	
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface MojangUUIDRestUrl {}
	
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface MojangUUIDFieldName {}
	//formatter:on
}
