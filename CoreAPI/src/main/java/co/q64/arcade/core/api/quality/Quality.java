package co.q64.arcade.core.api.quality;

/**
 * Quality of an ArcadeItem
 * @author Dylan
 *
 */
public interface Quality {
	/**
	 * Gets the name of this quality
	 * @return the quality name
	 */
	public String getName();
	
	/**
	 * Gets the color of this quality
	 * @return the quality color
	 */
	public String getColor();
}
