package co.q64.arcade.core.api.paint;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Utility class allowing the registration of paints
 * @author Dylan
 *
 */
@Injectable
@Global
public interface PaintRegistration {
	/**
	 * Adds an enum of unusual paints to the registry
	 * @param type the type of paint to register
	 * @param library the enum of paints
	 */
	public void register(PaintType type, Class<? extends UnusualPaint> library);
}
