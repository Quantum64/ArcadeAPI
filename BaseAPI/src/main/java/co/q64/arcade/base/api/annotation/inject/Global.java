package co.q64.arcade.base.api.annotation.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicated that only one instance of this class will exist
 * for a standard runtime enviorment
 * @author Dylan
 *
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.SOURCE)
@Noinject
public @interface Global {

}
