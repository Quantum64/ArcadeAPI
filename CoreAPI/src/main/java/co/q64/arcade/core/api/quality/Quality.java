package co.q64.arcade.core.api.quality;

import co.q64.arcade.base.api.annotation.inject.Noinject;

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

	/**
	 * Checks if a quality is equal to this quality
	 * @param quality the quality to test
	 * @return if it is equal to this quality
	 */
	public default boolean equals(Quality quality) {
		return quality.getName().equals(getName()) && quality.getColor().equals(getColor());
	}
}
