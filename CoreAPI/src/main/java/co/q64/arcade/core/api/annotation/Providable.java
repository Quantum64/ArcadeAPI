package co.q64.arcade.core.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicated that this class is usually injected as a @Inject Provider<Clazz> 
 * instead of a single instance @Inject Clazz
 * Classes annotated with @Providable are never @Global
 * @author Dylan
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Noinject
public @interface Providable {

}
