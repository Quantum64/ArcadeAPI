package co.q64.arcade.base.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public interface BaseOptionBinders {
	//formatter:off
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface PacketPortKey {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface PacketUUIDKey {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface PacketIPKey {}
	
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface SQLBoss {}
	//formatter:on
}
