package co.q64.arcade.core.api.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

public class CoreConstantBinders {
	@Target({ ElementType.FIELD }) @Retention(RUNTIME) @BindingAnnotation
	public static @interface RewardsAnimationDistance {}
}
