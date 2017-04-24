package co.q64.arcade.core.api.annotation.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates that this class is ready to be injected anywhere in your
 * code with an @Inject annotation
 * @author Dylan
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Noinject
public @interface Injectable {

}
