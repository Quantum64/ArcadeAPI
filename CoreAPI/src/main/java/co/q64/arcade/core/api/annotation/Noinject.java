package co.q64.arcade.core.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicated that this class should never be injected in any circumstance
 * because it represents an object that does not have an implementation
 * or is nor applicable to creating injected instances
 * @author Dylan
 *
 */
@Target({ ElementType.TYPE })
@Retention(RetentionPolicy.SOURCE)
public @interface Noinject {
	/**
	 * A reason indicating the programmer is responsible for implementing this class if they want to use it
	 * because no default implementation is supplied
	 */
	public static final String IMPLEMENT = "This class must be implemented";
	
	/**
	 * A reason indicating that this class is used for storing final data, usually returned from
	 * other API classes, and there is no reason to create a blank copt of this class
	 */
	public static final String DATA = "This class is a return data type";
	
	/**
	 * A reason indicating that this class contains only static unitlty methods and that
	 * an instance should never exist
	 */
	public static final String STATIC = "This class is for static use only";

	/**
	 * Gets the reason why this class shouldn't be injected
	 * @return the given reason
	 */
	public String reason() default "This class cannot be injected, it may either be a data only result type or must be implemented";
}
