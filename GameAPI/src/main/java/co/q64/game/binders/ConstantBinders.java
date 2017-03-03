package co.q64.game.binders;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import com.google.inject.BindingAnnotation;

/**
 * Constants that modules can rebind to change various game attributes
 * @author Dylan
 *
 */
public class ConstantBinders {
	//formatter:off
	/**
	 * Bind a string constant to this annotation to change the text that
	 * appears on the actionbar as a game is starting
	 */
	@Target({ ElementType.FIELD })
	@Retention(RUNTIME)@BindingAnnotation
	public static @interface ActionbarGameStart {}
	//formatter:on
}
