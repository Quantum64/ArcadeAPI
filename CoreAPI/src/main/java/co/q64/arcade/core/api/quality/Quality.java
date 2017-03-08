package co.q64.arcade.core.api.quality;

import co.q64.arcade.core.api.annotation.Noinject;

/**
 * Quality of an ArcadeItem
 * @author Dylan
 *
 */
@Noinject(reason = Noinject.DATA)
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
