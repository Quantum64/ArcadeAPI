package co.q64.arcade.base.api.util.chat;

import co.q64.arcade.base.api.annotation.inject.Global;
import co.q64.arcade.base.api.annotation.inject.Injectable;

/**
 * Utility class for converting a timestamp to a human readable time difference
 * @author Dylan
 *
 */
@Injectable
@Global
public interface TimeMessageGenerator {
	/**
	 * Provides the difference from the current time and 'end' in a human readable format
	 * @param end the time to calculate the time difference to
	 * @return the human readable time difference
	 */
	public String getTimeMessage(long end);

	public String getHumanTime(long current);
}
