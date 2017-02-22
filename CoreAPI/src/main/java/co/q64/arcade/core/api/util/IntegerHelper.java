package co.q64.arcade.core.api.util;

/**
 * Converting strings to integers the nice way since 2017
 * @author Dylan
 *
 */
public interface IntegerHelper {
	/**
	 * Converts a string to an integer
	 * @param s the string to convert
	 * @return the integer value, or 0 if the string does not represent an integer
	 */
	public int toInt(String s);

	/**
	 * Converts a string to an integer
	 * @param s the string to convert
	 * @param def the default value to return if the string is not an integer
	 * @return the integer value, or def if the string does not represent an integer
	 */
	public int toInt(String s, int def);

	/**
	 * Determines if a given string can be converted to an integer
	 * @param s the string to test
	 * @return if the given string is an integer
	 */
	public boolean isInt(String s);
}
