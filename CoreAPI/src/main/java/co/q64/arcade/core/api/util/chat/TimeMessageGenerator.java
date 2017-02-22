package co.q64.arcade.core.api.util.chat;

/**
 * Utility class for converting a timestamp to a human readable time difference
 * @author Dylan
 *
 */
public interface TimeMessageGenerator {
	/**
	 * Provides the difference from the current time and 'end' in a human readable format
	 * @param end the time to calculate the time difference to
	 * @return the human readable time difference
	 */
	public String getTimeMessage(long end);
}
