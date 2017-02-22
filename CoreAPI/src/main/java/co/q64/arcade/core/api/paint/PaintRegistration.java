package co.q64.arcade.core.api.paint;

/**
 * Utility class allowing the registration of paints
 * @author Dylan
 *
 */
public interface PaintRegistration {
	/**
	 * Adds an enum of unusual paints to the registry
	 * @param type the type of paint to register
	 * @param library the enum of paints
	 */
	public void register(PaintType type, Class<? extends UnusualPaint> library);
}
