package co.q64.arcade.core.api.util.chat;

import co.q64.arcade.core.api.annotation.Global;
import co.q64.arcade.core.api.annotation.Injectable;

/**
 * Converts strings to formatted messages for displaying to users
 * @author Dylan
 *
 */
@Injectable
@Global
public interface ChatUtil {

	/**
	 * Gets a formatted message prefix with the specified content
	 * @param content the string of the prefix
	 * @return the completed prefix
	 */
	public String getPrefix(String content);

	/**
	 * Gets the chat color for most of the message
	 * @return the chat color for the main part of the message
	 */
	public String getMessageColor();

	/**
	 * Gets the message accent color, also the color of the {@link ChatUtil#getSpecialPrefix() getSpecialChar}
	 * @return the message accent color
	 */
	public String getAccentColor();

	/**
	 * Gets the message auxiliary color, also the color of the {@link ChatUtil#getSpecialChar() getSpecialChar}
	 * @return the message auxiliary color
	 */
	public String getAuxColor();

	/**
	 * Rounds a float so that it is human readable
	 * @param number the float to be rounded
	 * @return the human readable float
	 */
	public String getRoundedFloat(float number);

	/**
	 * This is the character that splits the prefix and the message
	 * @return the special char
	 */
	public String getSpecialChar();
}
