package co.q64.arcade.base.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public interface BaseConstantBinders {
	//formatter:off
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface ModuleName {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface DefaultDataName {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface ConsoleMessageReceiver {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface CoreVersion {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface CurrentPacketDestination {}
	//formatter:on
}
