package co.q64.arcade.api.inject;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public class DefaultConstantBinders {
	//formatter:off
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface LoaderVersion {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface ExternalVersion {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface UniverseName {}
	//formatter:on
}
