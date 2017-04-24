package co.q64.arcade.foundation.api.annotation.inject;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicated that only one instance of this class will exist
 * for the entire lifetime of the application, or that an
 * instance will not exist at all
 * @author Dylan
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.SOURCE)
@Noinject
public @interface Universal {

}
